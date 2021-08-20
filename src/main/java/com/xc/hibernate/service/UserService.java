package com.xc.hibernate.service;

import com.xc.hibernate.entity.User;

import java.util.List;

public interface UserService {

    List<User> getByNameAndAge(String name,int age);

    List<User> queryAll();

    User saveUser(User user);

}
