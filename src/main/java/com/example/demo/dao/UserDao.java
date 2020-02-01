package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Auther GLZ
 * @Date 2020/2/1
 * @Description com.example.demo.dao
 */
@Component
public interface UserDao extends JpaRepository<User,Integer> {
}
