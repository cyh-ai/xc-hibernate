package com.xc.hibernate.dao;

import com.xc.hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    List<User> getByNameAndAge(String name,int age);
}
