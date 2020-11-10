package com.point.excel;

import com.alibaba.fastjson.JSON;
import com.point.common.CustomerException;
import com.point.entity.Drawing;
import com.point.entity.Drawingtable;
import com.point.entity.DrawingtableColumnname;
import com.point.newPDF.entity.select.DataTableEntity;
import com.point.newPDF.entity.select.TableColumnEntity;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

@Component
public class DrawingTableExcelUtil {
    /**
     * 检验文件是否有效
     *
     * @param file
     * @throws Exception
     */
    private Integer cellWidth=30*256,cellHeight=30;
    public void checkFile(MultipartFile file) throws Exception {
        // 判断文件是否存在
        if (null == file) {
            throw new CustomerException("文件不存在！");
        }
        // 获得文件名
        String fileName = file.getOriginalFilename();
        // 判断文件是否是excel文件
        if (!fileName.endsWith("xls") && !fileName.endsWith("xlsx")) {
            throw new CustomerException(fileName + "不是excel文件");
        }
    }

    /**
     * 获取workbook
     *
     * @param file
     * @return
     */
    public Workbook getWorkBook(MultipartFile file) {
        // 获得文件名
        String fileName = file.getOriginalFilename();
        // 创建Workbook工作薄对象，表示整个excel
        Workbook workbook = null;
        try {
            // 获取excel文件的io流
            InputStream is = file.getInputStream();
            // 根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if (fileName.endsWith(".xls")) {
                // 2003
                workbook = new HSSFWorkbook(is);
            } else if (fileName.endsWith(".xlsx")) {
                // 2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {

        }
        return workbook;
    }

    public List<Drawingtable> readExcel(MultipartFile file, String drawingName) throws Exception {
        // 获得Workbook工作薄对象
        Workbook workbook = getWorkBook(file);
        //检查是否是excel文件
        checkFile(file);
        // 获取第一个张表
        Sheet sheet = workbook.getSheetAt(0);
        //判断后续表行是否已经没有数据了
        Row rowS, rowN; // 获取行
        List<Drawingtable> columnMap = new ArrayList<>();
        Iterator<Row> ir = sheet.rowIterator();
        Iterator<Cell> ic;
        if (ir.hasNext())
            rowS = ir.next();
        if (ir.hasNext())
            rowS = ir.next();
        try{
            while (ir.hasNext()) {
                rowS = ir.next();
                ic = rowS.cellIterator();
                Cell colname = ic.next();
                if (colname.getCellType() == Cell.CELL_TYPE_BLANK)
                    continue;
                colname.setCellType(Cell.CELL_TYPE_STRING);
                Drawingtable table =new Drawingtable();
                table.setDrawingname(drawingName);
                table.setDrawingtype(colname.toString());
                Class clazz = table.getClass();
                int i=0;
                while (ic.hasNext()) {
                    Cell col = ic.next();
                    if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                        continue;
                    Field field=clazz.getDeclaredField("column"+ ++i);
                    field.setAccessible(true);
                    col.setCellType(Cell.CELL_TYPE_STRING);
                    field.set(table,col.toString());
                }
                columnMap.add(table);
            }
        }catch (NoSuchElementException e){

        }
        return columnMap;
    }

    public List<DrawingtableColumnname> readHead(MultipartFile file,String drawingName) throws Exception {
        // 获得Workbook工作薄对象
        Workbook workbook = getWorkBook(file);
        //检查是否是excel文件
        checkFile(file);
        // 获取第一个张表
        Sheet sheet = workbook.getSheetAt(0);
        //判断后续表行是否已经没有数据了
        Row rowS, rowN; // 获取行
        List<DrawingtableColumnname> columnMap = new ArrayList<>();
        Iterator<Row> ir = sheet.rowIterator();
        Iterator<Cell> ic;
        if (ir.hasNext())
            rowS = ir.next();
        else
            throw new CustomerException("缺失数据");
        ic = rowS.cellIterator();
        while (ic.hasNext()) {
            Cell col = ic.next();
            System.out.println(col.getCellType());
            if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                continue;
            else if (col.getColumnIndex() < 1)
                continue;
            DrawingtableColumnname newCol = new DrawingtableColumnname();
            col.setCellType(Cell.CELL_TYPE_STRING);
            newCol.setDrawingname(drawingName);
            newCol.setColumnno(col.toString());
            columnMap.add(newCol);
        }
        if (ir.hasNext())
            rowS = ir.next();
        else
            throw new CustomerException("缺失数据");
        ic = rowS.cellIterator();
        ic.next();
        Iterator<DrawingtableColumnname> it=columnMap.iterator();
        while (ic.hasNext()&&it.hasNext()) {
            Cell col = ic.next();
            DrawingtableColumnname i=it.next();
            if (col.getCellType() == Cell.CELL_TYPE_BLANK)
                continue;
            else if (col.getColumnIndex() < 1)
                continue;
            col.setCellType(Cell.CELL_TYPE_STRING);
            i.setColumnname(col.toString());
        }
        return columnMap;
    }

    public Workbook getHSSFWorkbook( List<Drawingtable> table,List<DrawingtableColumnname> columns) {
        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        Workbook wb = new HSSFWorkbook();
        try {
            // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
            Sheet sheet = wb.createSheet();
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
            int columnn = 0,rown=0,count=1;
            sheet.setColumnWidth(rown, cellWidth);
            Row row1 = sheet.createRow(rown++);
            sheet.setColumnWidth(rown, cellWidth);
            Row row2 = sheet.createRow(rown++);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            CellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
            Cell cell1 = row1.createCell(columnn);
            Cell cell2 = row2.createCell(columnn++);
            cell1.setCellValue("");
            cell1.setCellStyle(style);
            cell2.setCellValue("");
            cell2.setCellStyle(style);
            Iterator<DrawingtableColumnname> ic=columns.iterator();
            List <String> sortLis=new ArrayList<>();
            while (ic.hasNext()) {
                count++;
                DrawingtableColumnname entity=ic.next();
                cell1 = row1.createCell(columnn);
                cell1.setCellValue(entity.getColumnno());
                cell1.setCellStyle(style);
                cell2 = row2.createCell(columnn++);
                cell2.setCellValue(entity.getColumnname());
                cell2.setCellStyle(style);
            }
            Iterator<Drawingtable> di=table.iterator();
            while (di.hasNext()){
                sheet.setColumnWidth(rown, cellWidth);
                Row row = sheet.createRow(rown++);
                Drawingtable col=di.next();
                columnn=0;
                int temp=0;
                Cell cell= row.createCell(columnn++);
                cell.setCellStyle(style);
                Iterator<String> i=sortLis.iterator();
                cell.setCellValue(col.getDrawingtype());
                Class clazz=col.getClass();
                while (count-temp++!=0){
                    cell = row.createCell(columnn++);
                    cell.setCellStyle(style);
                    Field field=clazz.getDeclaredField("column"+temp);
                    field.setAccessible(true);
                    cell.setCellValue((String)field.get(col));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return wb;
    }

}
