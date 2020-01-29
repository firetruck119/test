package com.point.excel;

import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectData;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.*;

@Component
public class ExcelUtil {
    /**
     * 检验文件是否有效
     *
     * @param file
     * @throws Exception
     */
    public static void checkFile(MultipartFile file) throws Exception {
        // 判断文件是否存在
        if (null == file) {
            throw new FileNotFoundException("文件不存在！");
        }
        // 获得文件名
        String fileName = file.getOriginalFilename();
        // 判断文件是否是excel文件
        if (!fileName.endsWith("xls") && !fileName.endsWith("xlsx")) {
            throw new IOException(fileName + "不是excel文件");
        }
    }

    /**
     * 获取workbook
     *
     * @param file
     * @return
     */
   public static Workbook getWorkBook(MultipartFile file) {
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

    /**
     * 获取解析后的文件内容
     *
     * @return
     */
    public List<ProjectData> readExcel(MultipartFile file, int columns) throws Exception {
        List<ProjectData> list = new ArrayList<ProjectData>();
        try {
            checkFile(file);
            // 获得Workbook工作薄对象
            Workbook workbook = getWorkBook(file);

            // 获取第一个张表
            Sheet sheet = workbook.getSheetAt(0);
            // 获取每行中的字段
            for (int r = 1; r <= sheet.getLastRowNum(); r++) {
                try {
                    Row row = sheet.getRow(r); // 获取行
                    // 获取单元格中的值并存到对象中
                    ProjectData ProjectData = new ProjectData();
                    String strId = row.getCell(0).toString();
                    int id = 0;
                    if (strId == null || !strId.isEmpty())
                        try {
                            id = (int) (Double.parseDouble(strId));
                        } catch (Exception ex) {
                            throw new CustomerException("第" + (r + 1) + "行序号不正确");
                        }

                    ProjectData.setProjectdataid(id);
                    ProjectData.setProjectname(row.getCell(1).toString());
                    for (int column = 1; column <= columns; column++) {
                        Field dataColumnFeild = ProjectData.class.getDeclaredField("datacolumn" + column);
                        dataColumnFeild.setAccessible(true);
                        dataColumnFeild.set(ProjectData, row.getCell(column + 1).toString());
                    }
                    list.add(ProjectData);
                } catch (Exception ex) {
                    throw new CustomerException("第" + (r + 1) + "行数据不正确，序号必须为数字，其他列不能为空");
                }
            }

        } catch (Exception e) {
            throw new CustomerException("Excel导入失败！");
        }
        return list;
    }

    public static HSSFWorkbook getHSSFWorkbook(List<ProjectData> datalist, List<ProjectColumnDefinition> definitionList) {

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        try {
            // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet sheet = wb.createSheet();
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
            HSSFRow row = sheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
            int column = 0;
            HSSFCell cell1 = row.createCell(column++);
            cell1.setCellValue("序号");
            cell1.setCellStyle(style);
            HSSFCell cell2 = row.createCell(column++);
            cell2.setCellValue("名称");
            cell2.setCellStyle(style);
            Map<Integer, ProjectColumnDefinition> definitionMap = new HashMap<>();
            definitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            for (ProjectColumnDefinition projectColumnDefinition : definitionList) {
                HSSFCell cell3 = row.createCell(column++);
                cell3.setCellValue(projectColumnDefinition.getColumnname());
                cell3.setCellStyle(style);
                definitionMap.put(projectColumnDefinition.getProjectcolumndefinitionid(), projectColumnDefinition);
            }
            //创建内容
            for (int i = 0; i < datalist.size(); i++) {
                //第一行是表头，第二行开始插数据
                row = sheet.createRow(i + 1);
                int dataColumn = 0;
                ProjectData projectData = datalist.get(i);
                Cell idCell = row.createCell(dataColumn++);
                idCell.setCellValue(projectData.getProjectdataid());
                idCell.setCellType(Cell.CELL_TYPE_NUMERIC);
                Cell nameCell = row.createCell(dataColumn++);
                nameCell.setCellValue(projectData.getProjectname());
                nameCell.setCellType(Cell.CELL_TYPE_STRING);
                for (int dataColumnIndex = 0; dataColumnIndex < definitionList.size(); dataColumnIndex++) {
                    Field dataColumnField = ProjectData.class.getDeclaredField("datacolumn" + dataColumnIndex);
                    String value = dataColumnField.get(projectData) == null ? "null" : dataColumnField.get(projectData).toString();
                    Cell dataCell = row.createCell(dataColumn++);
                    dataCell.setCellValue(value);
                    dataCell.setCellType(definitionMap.get(dataColumnIndex).getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC
                            ? Cell.CELL_TYPE_NUMERIC : Cell.CELL_TYPE_STRING);
                }
            }
        } catch (Exception ex) {

        }
        return wb;
    }

    /**
    public void export(HttpServletResponse response) {
        //excel文件名
        String fileName = "测试一号.xls";
        //创建HSSFWorkbook,别问我list哪来的，我哪知道你数据哪来的
        HSSFWorkbook wb = getHSSFWorkbook(list);
        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     **/
}
