package com.example.SpringBootstart.autoMabatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootstart.autoMabatis.bean.TbUser;
import com.example.SpringBootstart.autoMabatis.bean.TbUserExample;
import com.example.SpringBootstart.autoMabatis.mapper.TbUserMapper;

@Service
public class ExampleService {

    @Autowired
    TbUserMapper sysUser;

    public List<TbUser> get() {
        TbUserExample example = new TbUserExample();
        example.setLimitStart(0);
        example.setCount(10);
        return sysUser.selectByExample(example);
    }





}