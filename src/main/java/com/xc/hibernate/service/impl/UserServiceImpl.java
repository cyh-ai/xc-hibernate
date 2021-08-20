package com.xc.hibernate.service.impl;

import com.xc.hibernate.dao.UserDao;
import com.xc.hibernate.entity.User;
import com.xc.hibernate.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> getByNameAndAge(String name, int age) {
        return userDao.getByNameAndAge(name,age);
    }

    @Override
    public List<User> queryAll() {
        return userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }
}
