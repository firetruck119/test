package com.point.newPDF.controller;

import com.point.entity.Drawing;
import com.point.entity.Drawingtable;
import com.point.entity.DrawingtableColumnname;
import com.point.excel.DrawingTableExcelUtil;
import com.point.mapper.DrawingDao;
import com.point.mapper.DrawingtableColumnnameDao;
import com.point.mapper.DrawingtableDao;
import com.point.newPDF.entity.select.DataTableEntity;
import com.point.security.error.UserException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.*;

@Controller
public class DrawingTableController {

    @Autowired
    private DrawingDao drawing;
    @Autowired
    private DrawingtableDao drawingtable;
    @Autowired
    private DrawingtableColumnnameDao Columnn;
    @Autowired
    DrawingTableExcelUtil util;

    @GetMapping("/drawingTable")
    public String getWeb(Model model) {
        model.addAttribute("mainHtml", "drawing");
        model.addAttribute("pdfname", "drawing");
        return "newHtml/home";
    }

    @GetMapping("/drawingTable/getList")
    @ResponseBody
    public List<Drawing> getList() {
        return drawing.getAll();
    }

    @PostMapping("/drawingTable/addDrawing")
    @ResponseBody
    public void addDrawing(Drawing entity) {
        drawing.insert(entity);
    }

    @PostMapping("/drawingTable/upDrawing")
    @ResponseBody
    public void upDrawing(Drawing entity) {
        drawing.updateByPrimaryKey(entity);

    }

    @PostMapping("/drawingTable/deleteDrawing")
    @ResponseBody
    public void deleteDrawing(Integer id) {
        drawing.deleteByPrimaryKey(id);
        drawingtable.deleteByDrawingNane(id.toString());
        Columnn.deleteByDrawingNane(id.toString());
    }

    @PostMapping("/drawingTable/insertOrUpdateDrawing")
    @ResponseBody
    public void insertOrUpdateDrawing(@RequestParam("excelData") MultipartFile file, Drawing drawing) throws Exception {
        List<Drawingtable> table = util.readExcel(file, drawing.getId().toString());
        addDrawingTable(table, drawing.getId());
        List<DrawingtableColumnname> columns = util.readHead(file, drawing.getId().toString());
        addDrawingTableClumn(columns, drawing.getId());
    }

    public void addDrawingTable(List<Drawingtable> table, Integer id) {
        drawingtable.deleteByDrawingNane(id.toString());
        Iterator<Drawingtable> it = table.iterator();
        while (it.hasNext())
            drawingtable.insert(it.next());
    }

    public void addDrawingTableClumn(List<DrawingtableColumnname> columns, Integer id) {
        Columnn.deleteByDrawingNane(id.toString());
        Iterator<DrawingtableColumnname> it = columns.iterator();
        while (it.hasNext())
            Columnn.insert(it.next());
    }

    @GetMapping("/drawingTable/getColumns")
    @ResponseBody
    public List<DrawingtableColumnname> selectColumnsByDrawingid(String name) {
        return Columnn.selectColumnsByDrawingName(name);
    }

    @GetMapping("/drawingTable/getTable")
    @ResponseBody
    public List<Drawingtable> selectTableByDrawingid(String name) {
        return drawingtable.selectTableByDrawingName(name);
    }

    @GetMapping("/drawingTable/getColumnsByNo")
    @ResponseBody
    public List<DrawingtableColumnname> selectColumnsByDrawingNo(String name) {
        return Columnn.selectColumnsByDrawingName(drawing.getByNo(name).getId().toString());
    }

    @GetMapping("/drawingTable/getTableByNo")
    @ResponseBody
    public List<Drawingtable> selectTableByDrawingNo(String name) {
        return drawingtable.selectTableByDrawingName(drawing.getByNo(name).getId().toString());
    }

    @PostMapping("/drawingTable/getExcel")
    @ResponseBody
    public void getExcel(@RequestBody Drawing d, HttpServletResponse response) throws IOException {
        List<DrawingtableColumnname> columns = selectColumnsByDrawingid(d.getId().toString());
        List<Drawingtable> table = selectTableByDrawingid(d.getId().toString());
        Workbook workbook = util.getHSSFWorkbook(table, columns);
        workbook.write(response.getOutputStream());
    }

    @GetMapping("/dataTable/getDrawingNameList/{name}")
    @ResponseBody
    public Object getDrawingNameList(@PathVariable("name") String name) throws NoSuchFieldException, IllegalAccessException {
        Drawing d = drawing.getByNo(name);
        List<DrawingtableColumnname> columns = selectColumnsByDrawingid(d.getId().toString());
        List<Drawingtable> table = selectTableByDrawingid(d.getId().toString());
        List<Hashtable> list=new ArrayList<>();
        Class classr;
        for(Drawingtable row :table){
            Hashtable<String,String> tb=new Hashtable<>();
            String temp;
            int i=1;
            classr=row.getClass();
            tb.put("drawingType",row.getDrawingtype());
            for(DrawingtableColumnname col : columns){
                Field field=classr.getDeclaredField("column"+i++);
                field.setAccessible(true);
                temp=field.get(row).toString();
                tb.put(col.getColumnno(),temp);
            }
            list.add(tb);
        }
        return list;
    }
    @GetMapping("/drawing/getImg")
    public void getImg2(HttpServletRequest request, HttpServletResponse response, String filename, String drawingname)
            throws IOException {
        FileInputStream fis = null;
        OutputStream os = null;
        try {
            try {
                fis = new FileInputStream("/root/drawing/" + drawingname + "/image/" + filename);
            } catch (Exception e) {
                System.out.println(e);
                fis = new FileInputStream("C:\\resource\\drawing\\" + drawingname + "\\image\\" + filename);
            }
            os = response.getOutputStream();
            int count = 0;
            byte[] buffer = new byte[1024 * 8];
            while ((count = fis.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getPDFName(String drawingname, Map<String, String> map) throws NoSuchFieldException, IllegalAccessException {
        Drawing d = drawing.getByNo(drawingname);
        List<DrawingtableColumnname> columns = Columnn.selectColumnsByDrawingName(d.getId().toString());
        Drawingtable table = new Drawingtable();
        table.setDrawingname(d.getId().toString());
        Class clazz = table.getClass();
        for (int i = 0; i < columns.size(); i++) {
            DrawingtableColumnname column = columns.get(i);
            Field field = clazz.getDeclaredField("column" + (i + 1));
            field.setAccessible(true);
            if (map.containsKey(column.getColumnno())) {
                String data = map.get(column.getColumnno());
                field.set(table, data);
            }
        }
        return drawingtable.selectByTable(table);
    }

    public Map<String, String> getPDF(String drawingname, Map<String, String> map) throws NoSuchFieldException, IllegalAccessException, UserException {
        Drawing d = drawing.getByNo(drawingname);
        List<DrawingtableColumnname> columns = Columnn.selectColumnsByDrawingName(d.getId().toString());
        Drawingtable table = new Drawingtable();
        table.setDrawingname(d.getId().toString());
        Class clazz = table.getClass();
        for (int i = 0; i < columns.size(); i++) {
            DrawingtableColumnname column = columns.get(i);
            Field field = clazz.getDeclaredField("column" + (i + 1));
            field.setAccessible(true);
            if (map.containsKey(column.getColumnno())) {
                String data = map.get(column.getColumnno());
                field.set(table, data);
            }
        }
        List<Drawingtable> tables = drawingtable.selectMapByTable(table);
        if (tables.size() > 1)
            throw new UserException("结果不唯一");
        Map<String, String> datas = new HashMap<>();
        table = tables.get(0);
        clazz = table.getClass();
        for (int i = 0; i < columns.size(); i++) {
            DrawingtableColumnname column = columns.get(i);
            Field field = clazz.getDeclaredField("column" + (i + 1));
            field.setAccessible(true);
            String s = field.get(table).toString();
            datas.put(columns.get(i).getColumnno(), s);
        }
        datas.put("th",table.getDrawingtype());
        return datas;
    }
}
