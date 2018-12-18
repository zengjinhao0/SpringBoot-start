package com.example.SpringBootstart.autoMabatis.service;

import com.example.SpringBootstart.autoMabatis.bean.TbUser;
import com.example.SpringBootstart.autoMabatis.bean.User;
import com.example.SpringBootstart.autoMabatis.bean.UserExample;
import com.example.SpringBootstart.autoMabatis.mapper.TbUserMapper;
import com.example.SpringBootstart.autoMabatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    TbUserMapper sysUser;
    @Autowired
    UserMapper userMapper;

    public List<User> get() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria =example.createCriteria();
        //criteria.andUsernameEqualTo("2222");

        User user =new User();
        user.setName("6666666");
        int aaa =  userMapper.updateByExampleSelective(user,example);
        return null;
    }





}