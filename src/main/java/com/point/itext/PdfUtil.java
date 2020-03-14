package com.point.itext;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.point.common.MyEnv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class PdfUtil {

    @Autowired
    PdfCreater pdfCreater;

    private void setImage(PdfStamper ps,String key,String fileName) throws Exception{
        AcroFields s = ps.getAcroFields(); //读取文本域
        List<AcroFields.FieldPosition> list = s.getFieldPositions(key);
        Image image;
        if(MyEnv.isLocal()){
            image = Image.getInstance("C://resource/image/"+fileName+".jpg");
        }else{
            image = Image.getInstance("/root/image/"+fileName+".jpg");
        }
        if(list!=null){
            for (AcroFields.FieldPosition item:list){
                Rectangle signRect = item.position;
                PdfContentByte under = ps.getOverContent(item.page);
                float x = signRect.getLeft();
                float y = signRect.getBottom();
                System.out.println(x);
                System.out.println(y);
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
    public byte[] fromPDFTempletToPdfWithValue(Map<String,String> textMap,Map<String,String> imageMap,String fileName) {
        ByteArrayOutputStream bos=null;
        PdfStamper ps=null;
        Document document=null;
        byte[] result=null;
        try {
            PdfReader reader=pdfCreater.getReaderByFileName(fileName);
            bos = new ByteArrayOutputStream();
            ps = new PdfStamper(reader, bos);
            /**
             * 使用中文字体 如果是利用 AcroFields填充值的不需要在程序中设置字体，在模板文件中设置字体为中文字体就行了
             */
            //   BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
            //     BaseFont.NOT_EMBEDDED);
            //   Font font = new Font(bf, 12, Font.NORMAL);
            AcroFields s = ps.getAcroFields(); //读取文本域
            //BaseFont bf = BaseFont.createFont("D:/Fonts/times.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            if(textMap!=null){
                for(Map.Entry<String,String> entry :textMap.entrySet()){
                    //s.setFieldProperty(key,"textfont",bf,null);
                    s.setField(entry.getKey(), entry.getValue());
                }
            }
            if (imageMap!=null){
                for(Map.Entry<String,String> entry :imageMap.entrySet()){
                    //s.setFieldProperty(key,"textfont",bf,null);
                    setImage(ps,entry.getKey(), entry.getValue());
                }
            }
            document = new Document();
            document.open();
            ps.setFormFlattening(true);
            ps.close();
            result=bos.toByteArray();
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
    public byte[] reFileToByteArray() {
        // TODO Auto-generated method stub
        return null;
    }
}
