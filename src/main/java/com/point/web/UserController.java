package com.point.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.point.entity.ComponentArmEntity;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProcessResultsJsonModel;
import com.point.mapper.ComponentArmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.point.entity.UserEntity;
import com.point.mapper.UserMapper;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ComponentArmMapper componentArmMapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @RequestMapping(value="/deletearm/{id}")
    public ProcessResultsJsonModel delete(@PathVariable("id") Long id) {
        ProcessResultsJsonModel result = new ProcessResultsJsonModel<>();
        componentArmMapper.delete(id);
        result.setStatus("1");
        return result;
    }

    @RequestMapping("/getComponentArm")
    public GridDataJsonModel getComponentArm() {
        GridDataJsonModel model = new GridDataJsonModel();
        List<ComponentArmEntity> users=componentArmMapper.getAll();
        model.setStatus("success");
        model.setData(users);
        model.setTotals(users.size());
        return model;
    }

    @PostMapping("/ComponentArmAdd")
    public String greetingSubmit(@ModelAttribute ComponentArmEntity componentArmEntity,HttpServletResponse response) {
        try {
            componentArmMapper.insert(componentArmEntity);
            response.sendRedirect("/ComponentArmList");
        } catch (IOException e1) {
        }
        return null;
    }

}
