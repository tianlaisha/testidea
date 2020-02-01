package com.example.demo.entity;


import javax.persistence.*;

/**
 * @version 1.0
 * @Auther GLZ
 * @Date 2020/2/1
 * @Description com.example.demo.entity
 */
@Entity(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;   // 自动增长

    @Column(name =  "name")
    private String name;

    @Column(name = "age")
    private Integer age;


}
