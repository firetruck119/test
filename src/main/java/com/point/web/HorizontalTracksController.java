package com.point.web;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.point.common.CommonFunc;
import com.point.entity.SteelEntity;
import com.point.entity.TrackEntity;
import com.point.entity.pdf.HorizontalTracksEntity;
import com.point.itext.PdfCreater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HorizontalTracksController {

    @Autowired
    PdfCreater pdf;

    Map<String, SteelEntity> steelMap=getSteelMap();
    Map<String, TrackEntity> trackMap=getTrackMap();


    public Map<String,SteelEntity> getSteelMap(){
        String[] sss={"235","275","345"};
        String[] shzrs={"650","750","800"};
        String[] gcphs={"Q235","Q275","Q345"};
        Map<String,SteelEntity> map=new HashMap<>();
        for (int i=0;i<gcphs.length;i++) {
            SteelEntity entity=new SteelEntity();
            entity.setGcph(gcphs[i]);
            entity.setShzr(shzrs[i]);
            entity.setSs(sss[i]);
            map.put(gcphs[i],entity);
        }
        return map;
    }
    public Map<String,TrackEntity> getTrackMap(){
        String[] gdxhs={"I20b","I22b","I25b","I28b","I32b","H175","H200","H250","H200+贴板","H250+贴板","拼焊H200*216","拼焊H250*266"};
        String[] gdxhen={"I20b","I22b","I25b","I28b","I32b","H175","H200","H250","H200 add plate","H250 add plate","Tailor-welded H200*216","Tailor-welded H250*266"};
        String[] hs={"200", "220", "250", "280", "320", "175", "200", "250", "200", "250", "216", "266"};
        String[] bs={"102", "112", "118", "124", "132", "175", "200", "250", "200", "250", "200", "250"};
        String[] tws={"9", "9.5", "10", "10.5", "11.5", "7.5", "8", "9", "8", "9", "16", "20"};
        String[] tfss={"11.4","12.3","13","13.7","15","11","12","14","12","14","25","30"};
        String[] tfxs={"11.4","12.3","13","13.7","15","11","12","14","12","14","20","25"};

        String[] sys={"146148","189805","246346","312266","426147","185134","262748","476285","369789","651448","490558","927001"};
        String[] iys={"25000000","35700000","52800000","74800000","115000000","29180000","47170000","106890000","69430000","152520000","90570000","210930000"};
        String[] izs={"1690000","2390000","3090000","3790000","5020000","9830000","16010000","36480000","22570000","50680000","30060000","71760000"};
        String[] wysels={"250000","325000","423000","534000","726000","334000","472000","855000","830000","1466000","894000","1671000"};
        String[] wyxels={"250000","325000","423000","534000","726000","334000","472000","855000","524000","942000","790000","1509000"};
        String[] wzels={"33100","42700","52400","61200","76000","112000","160000","292000","226000","405000","301000","574000"};
        Map<String,TrackEntity> map=new HashMap<>();
        for (int i=0;i<gdxhs.length;i++) {
            TrackEntity entity=new TrackEntity();
            entity.setGdxh(gdxhs[i]);
            entity.setGdxhen(gdxhen[i]);
            entity.setH(hs[i]);
            entity.setB(bs[i]);
            entity.setTw(tws[i]);
            entity.setTfs(tfss[i]);
            entity.setTfx(tfxs[i]);
            entity.setSy(sys[i]);
            entity.setIy(iys[i]);
            entity.setIz(izs[i]);
            entity.setWysel(wysels[i]);
            entity.setWyxel(wyxels[i]);
            entity.setWzel(wzels[i]);
            entity.setHy(entity.switchHy(gdxhs[i],Double.valueOf(tfss[i])));
            entity.setZ(entity.switchZ(gdxhs[i],Double.valueOf(hs[i])));
            entity.setY(CommonFunc.convertDoubleToString(Double.valueOf(bs[i])/2));
            entity.setHw(CommonFunc.convertDoubleToString(Double.valueOf(hs[i])-Double.valueOf(tfxs[i])-Double.valueOf(entity.getTfs())));
            map.put(gdxhs[i],entity);
        }
        return map;
    }
    @GetMapping("/HorizontalTracks")
    public String getMap(Model model, @ModelAttribute HorizontalTracksEntity entity){
        model.addAttribute("HorizontalTracksEntity",new HorizontalTracksEntity());
        return "HorizontalTracks";
    }

    private ResponseEntity<byte[]> getResponseEntity(String localName, byte[] bytes){
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String((localName+".pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return  new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
    }
    private Map<String ,Image> getImageMap(HttpServletRequest request) throws IOException, BadElementException {
        List<MultipartFile> files=((MultipartHttpServletRequest)request).getFiles("tu");
        Map<String,Image> imageMap=new HashMap<>();
        imageMap.put("tu",Image.getInstance(files.get(0).getBytes()));
        return imageMap;
    }
    @PostMapping("/pdf1")
    public Object sendPDF1(Model model, @ModelAttribute HorizontalTracksEntity horizontalTracksEntity, HttpServletRequest request){
        Map<String,String > textMap=new HashMap<>();
        textMap=horizontalTracksEntity.getMapForPdf1();
        Map<String,Image> imageMap = new HashMap<>();
        try {
            imageMap=getImageMap(request);
        }catch (Exception e){

        }
        byte[] pdfBtyes ;
        pdfBtyes=pdf.fromPDFTempletToPdfWithValue(textMap,imageMap,"轨道校核计算书（简支梁）");
        return getResponseEntity("轨道校核计算书（简支梁）",pdfBtyes);
    }

    @PostMapping("/pdf2")
    public Object sendPDF2(Model model, @ModelAttribute HorizontalTracksEntity horizontalTracksEntity, HttpServletRequest request){
        Map<String,String > textMap=new HashMap<>();
        textMap=horizontalTracksEntity.getMapForPdf2();
        Map<String,Image> imageMap = new HashMap<>();
        try {
            imageMap=getImageMap(request);
        }catch (Exception e){

        }
        byte[] pdfBtyes ;
        pdfBtyes=pdf.fromPDFTempletToPdfWithValue(textMap,imageMap,"轨道校核计算书（双跨梁）");
        return getResponseEntity("轨道校核计算书（双跨梁）",pdfBtyes);
    }

    @PostMapping("/pdf1en")
    public Object sendPDF1en(Model model, @ModelAttribute HorizontalTracksEntity horizontalTracksEntity, HttpServletRequest request){
        Map<String,String > textMap=new HashMap<>();
        textMap=horizontalTracksEntity.getMapForPdf1en();
        Map<String,Image> imageMap = new HashMap<>();
        try {
            imageMap=getImageMap(request);
        }catch (Exception e){

        }
        byte[] pdfBtyes ;
        pdfBtyes=pdf.fromPDFTempletToPdfWithValue(textMap,imageMap,"英文版轨道校核计算书（简支梁）");
        return getResponseEntity("英文版轨道校核计算书（简支梁）",pdfBtyes);
    }

    @PostMapping("/pdf2en")
    public Object sendPDF2en(Model model, @ModelAttribute HorizontalTracksEntity horizontalTracksEntity, HttpServletRequest request){
        Map<String,String > textMap=new HashMap<>();
        textMap=horizontalTracksEntity.getMapForPdf2en();
        Map<String,Image> imageMap = new HashMap<>();
        try {
            imageMap=getImageMap(request);
        }catch (Exception e){

        }
        byte[] pdfBtyes ;
        pdfBtyes=pdf.fromPDFTempletToPdfWithValue(textMap,imageMap,"英文版轨道校核计算书（双跨梁）");
        return getResponseEntity("英文版轨道校核计算书（双跨梁）",pdfBtyes);
    }
    @PostMapping("/pdf3")
    public Object sendPDF3(Model model, @ModelAttribute HorizontalTracksEntity horizontalTracksEntity, HttpServletRequest request) throws IOException, DocumentException {
        Map<String,String > textMap=new HashMap<>();
        textMap=horizontalTracksEntity.getMapForPdf2();
        Map<String,Image> imageMap = new HashMap<>();
        try {
            imageMap=getImageMap(request);
        }catch (Exception e){

        }
        List<byte[]> list= new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue(horizontalTracksEntity.getMapForPdf1(),imageMap,"轨道校核计算书（简支梁）"));
        list.add(pdf.fromPDFTempletToPdfWithValue(horizontalTracksEntity.getMapForPdf2(),imageMap,"轨道校核计算书（双跨梁）"));
        list.add(pdf.fromPDFTempletToPdfWithValue(horizontalTracksEntity.getMapForPdf3(),imageMap,"水平轨道计算书校核验证"));
        return getResponseEntity("水平轨道计算书校核验证",pdf.MergePDF(list));
    }

    @PostMapping("/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute HorizontalTracksEntity horizontalTracksEntity){
        return horizontalTracksEntity.getCheck();
    }

    @PostMapping("track")
    @ResponseBody
    public Object sendTrack(String name){
        return trackMap.get(name);
    }
    @PostMapping("steel")
    @ResponseBody
    public Object sendSteel(String name){
        return steelMap.get(name);
    }
}
