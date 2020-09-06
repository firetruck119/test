package com.point.web;

import com.point.entity.GridDataJsonModel;
import com.point.entity.OperateLog;
import com.point.entity.OperateLogExample;
import com.point.mapper.OperateLogMapper;
import com.point.mapper.UsersInfoMapper;
import com.point.newPDF.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OperationLogController {
    @Autowired
    private OperateLogMapper operateLogMapper;
    @Autowired
    private UsersInfoMapper usersInfoMapper;
    @GetMapping("/OperationLog/List")
    public String getProjectMap(Model model){
        model.addAttribute("mainHtml","log");
        model.addAttribute("pdfname","OperationLogList");
        return "newHtml/home";
    }

    @GetMapping("/TempPermission")
    public String tempPermission(){
        return "login/TempPermission";
    }

    @ResponseBody
    @PostMapping("/OperationLog/queryOperationLog")
    public GridDataJsonModel queryOperationLog(@RequestParam String user ,@RequestParam String operation) throws Exception{
        user=java.net.URLDecoder.decode(user,"UTF-8");
        operation=java.net.URLDecoder.decode(operation,"UTF-8");
        GridDataJsonModel model = new GridDataJsonModel();
        OperateLogExample operateLogExample = new OperateLogExample();
        OperateLogExample.Criteria criteria = operateLogExample.createCriteria();
        if(!StringUtils.isEmptyOrWhitespace(user)) {
            criteria.andUserrealnameLike("%"+user+"%");
        }
        if(!StringUtils.isEmptyOrWhitespace(operation)){
            criteria.andOperationLike("%"+operation+"%");
        }
        operateLogExample.setOrderByClause(" changelasttime desc limit 100 ");
        List<OperateLog> list = operateLogMapper.selectByExample(operateLogExample);
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

    @ResponseBody
    @GetMapping("/OperationLog/getOperations")
    public List<String> getOperations(){
        List<OperateLog> list = operateLogMapper.selectByExample(null);
        return list.stream().map(x->x.getOperation()).distinct().sorted().collect(Collectors.toList());
    }

    @ResponseBody
    @GetMapping("/OperationLog/getUsers")
    public List<String> getUsers(){
        List<UserEntity> list = usersInfoMapper.getAll();
        return list.stream().map(x->x.getUserrealname()).distinct().sorted().collect(Collectors.toList());
    }
}
