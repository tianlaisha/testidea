package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Auther GLZ
 * @Date 2020/2/1
 * @Description com.example.demo.demo
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String addUser(String name,Integer age){
     //   jdbcTemplate.update(""); // 写sql语句
        return "SUCESS";
    }


}



