package com.point;

import com.itextpdf.text.DocumentException;
import com.point.common.CommonFunc;
import com.point.entity.Drawing;
import com.point.entity.Drawingtable;
import com.point.entity.DrawingtableColumnname;
import com.point.entity.pdf.DijiaDrawingEntity;
import com.point.excel.DrawingTableExcelUtil;
import com.point.mapper.DrawingDao;
import com.point.mapper.DrawingtableColumnnameDao;
import com.point.mapper.DrawingtableDao;
import com.point.newPDF.Service.MailService;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.drawing.DijiaDrawingController;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.DrawingTable;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHandlingFormSubmissionApplicationTests {
	@Autowired
	private DrawingTableExcelUtil util;
	@Autowired
	private DrawingDao drawing;
	@Autowired
	private DrawingtableDao drawingtable;
	@Autowired
	private DrawingtableColumnnameDao Columnn;
	@Test
	public void sendmail() throws Exception {
		File file = new File("C:\\Users\\Administrator\\Desktop\\底架选型表.xlsx");
		FileInputStream input = new FileInputStream(file);
		MultipartFile multipartFile =new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));
		Drawing drawing=new Drawing();
		drawing.setDrawingname("123");
		List<Drawingtable> table=util.readExcel(multipartFile,"123");
		List<DrawingtableColumnname> columns=util.readHead(multipartFile,"123");
		Workbook workbook = util.getHSSFWorkbook( table,columns);
		workbook.write(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\3.xlsx"));
	}

	@Autowired
	DrawingTableController controller;

	@Autowired
	DijiaDrawingController d;
	@Test
	public void a() throws NoSuchFieldException, IllegalAccessException, DocumentException, IOException {
		d.showDrawing(null,null);
	}
	@Test
	public void t() throws Exception {
		DijiaDrawingEntity entity=new DijiaDrawingEntity();
		entity.setDjhzxs("上回转");
		entity.setLg("1.5");
		entity.setLl("2");
		entity.setHzzc("710");
		entity.setYxjgxz("160LZ");
		entity.setDjbdb("有");
		entity.setLzpxj("0.25");
		entity.setDjlx("管材式");
		entity.setDjqsjg("175");

		Class clazz = entity.getClass();
		Field[] fields=clazz.getDeclaredFields();
		Map<String,String> map=new HashMap<>();
		Iterator<Field> it= CollectionUtils.arrayToList(fields).iterator();
		try{
		while(it.hasNext()){
			Field f=it.next();
			f.setAccessible(true);
			String v=f.get(entity).toString();
			String name=f.getName();
			map.put(name,v);
		}}
		catch (Exception e){
			System.out.println(e);
		}
		List<String> s=controller.getPDFName("dijia",map);
		System.out.println(s);
	}
}
