package com.xc.hibernate.controller;

import com.xc.hibernate.entity.User;
import com.xc.hibernate.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/save")
    public User save(User user){
        return userService.saveUser(user);
    }

    @RequestMapping("/queryAll")
    public List<User> save(){
        return userService.queryAll();
    }

    @RequestMapping("/getByNameAndAge")
    public List<User> save(String name, int age){
        return userService.getByNameAndAge(name,age);
    }
}
