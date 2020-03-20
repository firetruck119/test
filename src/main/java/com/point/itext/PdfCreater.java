package com.point.itext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.point.common.MyEnv;
import com.point.entity.InputImageCache;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class PdfCreater {

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

    public byte[] reFileToByteArray() {
        // TODO Auto-generated method stub
        return null;
    }
    /**
     * 根据pdf模板填充相应的值： 1，如果是根据excel填充的话，在用Acrobat生成PDF模板前，
     * Excel单元格格式最好设置成文本，否则pdf填充值时可能中文无法显示
     */
    public byte[] fromPDFTempletToPdfWithValue_New(Map<String, String> textMap, Map<String, File> imageMap, String fileName) {
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
                for (Map.Entry<String, File> entry : imageMap.entrySet()) {
                    if(entry.getValue().length()>0){
                        setImage(ps, entry.getKey(), Image.getInstance(entry.getValue().getPath()));
                        File2byte(entry.getValue());
                    }
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
