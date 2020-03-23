package com.point.web.newController.Tool;

import com.itextpdf.text.BadElementException;
import com.point.common.ImageCacheData;
import com.point.common.MyEnv;
import com.point.entity.InputImageCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

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

    public Map<String, InputImageCache> getImageMap_New(HttpServletRequest request) throws IOException, BadElementException {
        Map<String, InputImageCache> imageMap = new HashMap<>();
        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();
        Map<String, String[]> a = request.getParameterMap();
        Map<String, String> imgIdMap = new HashMap();
        a.forEach((key, val) -> {
            if (key.indexOf("tu_") > -1) {
                imgIdMap.put(key.split("_")[1], val[0]);
            }
        });
        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            if (e.getValue().isEmpty())
                continue;
            InputImageCache data = new InputImageCache();
            data.setInputvalue(e.getValue().getBytes());
            data.setInputname(e.getKey());
            String s[] = e.getValue().getOriginalFilename().split("\\.");
            data.setType(s[s.length - 1]);
            imageMap.put(e.getKey(), data);
        }
        imgIdMap.forEach((key, id) -> {
            if (!imageMap.containsKey(key)) {
                imageMap.put(key, null);
            }
        });
        return imageMap;
    }

    public Map<String, File> getImageMap(String sjht,HttpServletRequest request) throws IOException, BadElementException {
        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();

        Map<String, String[]> a = request.getParameterMap();

        Map<String, File> imgMap = new HashMap();
        a.forEach((key, val) -> {
            String filename;
            File file=null;
            if (key.indexOf("tu_") > -1) {
                filename=val[0];
                if (MyEnv.isLocal()) {
                    file = new File("D:/image/"+filename);
                } else {
                    file = new File("/root/image/" + filename );
                }
                imgMap.put(key.split("_")[1], file);
            }
        });
        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            if (e.getValue().isEmpty())
                continue;
            File file=null;
            String s[] = e.getValue().getOriginalFilename().split("\\.");
            sjht= sjht!=null?sjht:"temp";
            String name=sjht+'_'+e.getKey();
            LocalDateTime t=LocalDateTime.now();
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyyMMdd");
            if (MyEnv.isLocal()) {
                file = new File("D:/image/"+name+t.format(dtf2)+'.'+s[s.length - 1]);
            } else {
                file = new File("/root/image/" + name +t.format(dtf2)+'.'+s[s.length - 1] );
            }
            e.getValue().transferTo(file);
            imgMap.put(e.getKey(), file);
        }
        return imgMap;
    }

}
