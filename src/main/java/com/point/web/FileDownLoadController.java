package com.point.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileDownLoadController {

    @GetMapping("/downloadLocal")
    public ModelAndView downloadLocal(HttpServletResponse response, String fileName) {
        try {
            // 读到流中
            InputStream inStream = new FileInputStream("/root/download/" + fileName);// 文件的存放路径
            // 设置输出的格式
            response.reset();
            response.setContentType("bin");
            response.addHeader("Content-Disposition", "attachment; filename=\""
                    + java.net.URLEncoder.encode(fileName, "UTF-8") + "\"");
            // 循环取出流中的数据
            byte[] b = new byte[100];
            int len;

            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            Map<String, String> modelMap = new HashMap<>();
            modelMap.put("message", "文件不存在");
            return new ModelAndView("ProjectData", modelMap);
        }
        return null;
    }

}
