package com.point.web.newController.Tool;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.point.common.ImageCacheData;
import com.point.entity.InputImageCache;
import com.point.mapper.InputImageCacheMapper;
import org.apache.xmlbeans.impl.schema.StscChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;

@Component
public class ToolForPDFController {

    @Autowired
    ImageCacheData mapper;
    public ResponseEntity<byte[]> getResponseEntity(String localName, byte[] bytes) {
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String((localName + ".pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
    }

    public Map<String, Image> getImageMap(HttpServletRequest request) throws IOException, BadElementException {
        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();
        Map<String, Image> imageMap = new HashMap<>();
        Map<String ,String[]> a=request.getParameterMap();
        Map<String,String> imgIdMap=new HashMap();
        a.forEach((key,val)-> {
            if (key.indexOf("tu_") > -1) {
                imgIdMap.put(key.split("_")[1], val[0]);
            }
        });
        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            if(e.getValue().isEmpty())
                continue;
            imageMap.put(e.getKey(), Image.getInstance(e.getValue().getBytes()));
        }
        imgIdMap.forEach((key,id)->{
            if(!imageMap.containsKey(key)){
                try {
                    imageMap.put(key,mapper.readCacheFromById(id));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (BadElementException e) {
                    e.printStackTrace();
                }
            }
        });
        return imageMap;
    }

    public Map<String, InputImageCache> getImageCacheMap(HttpServletRequest request) throws IOException {


        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();
        Map<String, InputImageCache> imageMap = new HashMap<>();
        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            if(e.getValue().isEmpty())
                continue;
            InputImageCache data=new InputImageCache();
            data.setInputvalue(e.getValue().getBytes());
            data.setInputname(e.getKey());
            String s[]=e.getValue().getOriginalFilename().split("\\.");
            data.setType(s[s.length-1]);
            imageMap.put(e.getKey(), data);
        }
        return imageMap;

    }

}
