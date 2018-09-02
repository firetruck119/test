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



}
