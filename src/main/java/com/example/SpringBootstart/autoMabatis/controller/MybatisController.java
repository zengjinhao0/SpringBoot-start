package com.example.SpringBootstart.autoMabatis.controller;

import com.example.SpringBootstart.autoMabatis.bean.TbUser;
import com.example.SpringBootstart.autoMabatis.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/springboot")
public class MybatisController {

    @Autowired
    private ExampleService service;


    //查询所有的用户
    @RequestMapping(value = "/get", produces = "application/json; charset=UTF-8")
    public List<TbUser> get() {
        System.out.println(service.get().toString());
        return service.get();
    }

}
