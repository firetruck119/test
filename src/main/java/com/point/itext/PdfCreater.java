package com.point.itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.point.common.CommonFunc;
import com.point.common.MyEnv;
import com.point.common.OperationLog;
import com.point.entity.InputImageCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

@Component
public class PdfCreater {

    @Autowired
    OperationLog operationLog;

    public Map entity2Map(Object entity){
        Class clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String, String> map = new HashMap<>();
        Iterator<Field> it = CollectionUtils.arrayToList(fields).iterator();
        try {
            while (it.hasNext()) {
                Field f = it.next();
                f.setAccessible(true);
                String v = "";
                if(f.getType().getName().toString().equals("java.lang.Double"))
                    v= CommonFunc.convertDoubleToString(Double.parseDouble(f.get(entity).toString()));
                else
                    v=f.get(entity).toString();
                String name = f.getName();
                map.put(name, v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }

    public static byte[] File2byte(File tradeFile){
        byte[] buffer = null;
        try
        {
            FileInputStream fis = new FileInputStream(tradeFile);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1)
            {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return buffer;
    }
    private void setImage(PdfStamper ps,String key,Image image) throws Exception{
        AcroFields s = ps.getAcroFields(); //读取文本域
        List<AcroFields.FieldPosition> list = s.getFieldPositions(key);
        if(list!=null){
            for (AcroFields.FieldPosition item:list){
                Rectangle signRect = item.position;
                PdfContentByte under = ps.getOverContent(item.page);
                float rectW = signRect.getWidth();
                float rectH = signRect.getHeight();
                float rectL = signRect.getLeft();
                float rectB = signRect.getBottom();
                float imageW=image.getWidth();
                float imageH=image.getHeight();
                float imageRatio=imageW/imageH;
                float rectRatio=rectW/rectH;
                float x=0,y=0;
                if(imageRatio<rectRatio){
                    x=rectL+(rectW-imageW*rectH/imageH)/2;
                    y=rectB;
                }else{
                    x=rectL;
                    y=rectB+(rectH-imageH*rectW/imageW)/2;
                }
                image.setAbsolutePosition(x, y);
                image.scaleToFit(signRect.getWidth(), signRect.getHeight());
                under.addImage(image);
            }
        }
    }
    /**
     * 根据pdf模板填充相应的值： 1，如果是根据excel填充的话，在用Acrobat生成PDF模板前，
     * Excel单元格格式最好设置成文本，否则pdf填充值时可能中文无法显示
     */
    public byte[] fromPDFTempletToPdfWithValue_New(Map<String, String> textMap, Map<String, File> imageMap, String fileName) {
        PdfReader reader=readFile(fileName);
        return setValue(textMap,imageMap,reader,true);//如果t为true那么生成的PDF文件不能编辑
    }
    public byte[] fromPDFTempletToPdfWithValue_Drawing(Map<String, String> textMap, Map<String, File> imageMap, String fileName) throws IOException {
        PdfReader reader;
        operationLog.writeOperateLog(fileName);
        if (MyEnv.isLocal()) {
            try {
                reader = new PdfReader("C://resource/drawing/" + fileName + ".pdf");
            } catch (Exception ex) {
                reader = new PdfReader("/root/drawing/" + fileName + ".pdf");
            }
        } else {
            try {
                reader = new PdfReader("/root/drawing/" + fileName + ".pdf");
            } catch (Exception ex) {
                reader = new PdfReader("C://resource/drawing/" + fileName + ".pdf");
            }
        }
        return setValue(textMap,imageMap,reader,false);//如果t为false那么生成的PDF文件能编辑
    }
    private byte[] setValue(Map<String, String> textMap, Map<String, File> imageMap, PdfReader reader, boolean t) {
        ByteArrayOutputStream bos = null;
        PdfStamper ps = null;
        Document document = null;
        byte[] result = null;
        try {
            bos = new ByteArrayOutputStream();
            ps = new PdfStamper(reader, bos);
            /**
             * 使用中文字体 如果是利用 AcroFields填充值的不需要在程序中设置字体，在模板文件中设置字体为中文字体就行了
             */
            AcroFields s = ps.getAcroFields(); //读取文本域
            if (textMap != null) {
                for (Map.Entry<String, String> entry : textMap.entrySet()) {
                    s.setField(entry.getKey(), entry.getValue());
                }
            }
            if (imageMap != null) {
                for (Map.Entry<String, File> entry : imageMap.entrySet()) {
                    if(entry.getValue().length()>0){
                        setImage(ps, entry.getKey(), Image.getInstance(entry.getValue().getPath()));
                        File2byte(entry.getValue());
                    }
                }
            }
            document = new Document();
            document.open();
            ps.setFormFlattening(t);//如果t为false那么生成的PDF文件还能编辑，一定要设为true
            ps.close();
            result = bos.toByteArray();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
            try {
                ps.close();
                bos.close();
            } catch (DocumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;//返回一个直接数组
    }

    private PdfReader readFile(String fileName) {
        PdfReader reader=null;
        try {
            reader=  getReaderByFileName(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return reader;
        }
    }

    public byte[] fromPDFTempletToPdfWithValue(Map<String, String> textMap, Map<String, Image> imageMap, String fileName) {
        ByteArrayOutputStream bos = null;
        PdfStamper ps = null;
        Document document = null;
        byte[] result = null;
        try {
            PdfReader reader = getReaderByFileName(fileName);
            bos = new ByteArrayOutputStream();
            ps = new PdfStamper(reader, bos);
            /**
             * 使用中文字体 如果是利用 AcroFields填充值的不需要在程序中设置字体，在模板文件中设置字体为中文字体就行了
             */
            AcroFields s = ps.getAcroFields(); //读取文本域
            if (textMap != null) {
                for (Map.Entry<String, String> entry : textMap.entrySet()) {
                    s.setField(entry.getKey(), entry.getValue());
                }
            }
            if (imageMap != null) {
                for (Map.Entry<String, Image> entry : imageMap.entrySet()) {
                    setImage(ps, entry.getKey(),entry.getValue());
                }
            }
            document = new Document();
            document.open();
            ps.setFormFlattening(true);
            ps.close();
            result = bos.toByteArray();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
            try {
                ps.close();
                bos.close();
            } catch (DocumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;//返回一个直接数组
    }
    public byte[] MergePDF(List<byte[]> bytes) throws IOException, DocumentException {
        List<PdfReader> readers=new ArrayList<>();
        for (byte[] e:bytes) {
            PdfStream pdfStream=new PdfStream(e);
            readers.add(new PdfReader(pdfStream.getBytes()));
        }
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,bos);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        int totalPages = 0;
        for (PdfReader e:readers) {
            totalPages+=e.getNumberOfPages();
        }
        int pageOfCurrentReaderPDF = 0;
        // Loop through the PDF files and add to the output.
        for (PdfReader e:readers) {
            while (pageOfCurrentReaderPDF < e.getNumberOfPages()) {
                document.newPage();//创建新的一页
                pageOfCurrentReaderPDF++;
                PdfImportedPage page = writer.getImportedPage(e, pageOfCurrentReaderPDF);
                cb.addTemplate(page, 0, 0);
            }
            pageOfCurrentReaderPDF = 0;
        }
        document.close();
        writer.close();
        return  bos.toByteArray();
    }
    public PdfReader getReaderByFileName(String fileName) throws IOException{
        PdfReader reader;
        operationLog.writeOperateLog(fileName);
        if (MyEnv.isLocal()) {
            try {
                reader = new PdfReader("C://resource/pdf/" + fileName + ".pdf");
            } catch (Exception ex) {
                reader = new PdfReader("/root/pdf/" + fileName + ".pdf");
            }
        } else {
            try {
                reader = new PdfReader("/root/pdf/" + fileName + ".pdf");
            } catch (Exception ex) {
                reader = new PdfReader("C://resource/pdf/" + fileName + ".pdf");
            }
        }
        return reader;
    }
}
