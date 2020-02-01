package com.example.demo.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Auther GLZ
 * @Date 2020/1/31
 * @Description com.example.demo.demo
 */
@Controller
public class HelloWorld {

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        return "hellocontorlle";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("mmmmmmm");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(Map<String,Object> map){
        map.put("name","llllllll");
        map.put("sex","0");
        List names = new ArrayList<String>();
        names.add("zhangsan");
        names.add("liszi");
        names.add("wangwu");
        map.put("names",names);
        return "index2";
    }

    @RequestMapping("/index3")
    public String addUser(String name,Integer age){
        return userService.addUser(name,age);
    }

    @RequestMapping("/index3")
    public String jpaUser(User user){
        userDao.save(user);
        List<User> userList = userDao.findAll();
        System.out.println(userList);
        return "index3";
    }

}
