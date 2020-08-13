package com.point.common;

import com.point.entity.OperateLog;
import com.point.mapper.OperateLogMapper;
import com.point.security.entity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class OperationLog {

    @Autowired
    private OperateLogMapper operateLogMapper;

    public void writeOperateLog(String operation){
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
            OperateLog operateLog = new OperateLog();
            operateLog.setOperation(operation);
            operateLog.setUserrealname(myUserDetails.getName());
            operateLogMapper.insertSelective(operateLog);
        }catch (Exception ex){
            Logger.getInstance().error("ex",ex);
        }
    }
}
