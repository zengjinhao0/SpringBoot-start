package com.example.SpringBootstart;

import com.example.SpringBootstart.autoMabatis.bean.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//如果我们需要使用页面开发只要使用 @Controller
@RestController
//表示该controller类下所有的方法都公用的一级上下文根
@RequestMapping(value = "/springboot")
public class TestController {
	
	
    //这里使用@RequestMapping注解表示该方法对应的二级上下文路径
    //url form形式提交的请求参数，那么必须使用@RequestParam注解来标示参数
    @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
    String getUserByGet(@RequestParam(value = "userName") String userName){
        return "Hello     " + userName;
    }       
    
    //通过RequestMethod.POST表示请求需要时POST方式
    //url form形式提交的请求参数，那么必须使用@RequestParam注解来标示参数
    @RequestMapping(value = "/getUserByPost", method = RequestMethod.POST)
    String getUserByPost(@RequestParam(value = "userName") String userName){
        return "Hello   " + userName;
    }
    
    
    //在入参设置@RequestBody注解表示接收整个报文体，这里主要用在接收整个POST请求中的json报文体，
    //目前主流的请求报文也都是JSON格式了，使用该注解就能够获取整个JSON报文体作为入参，使用JSON解析工具解析后获取具体参数
    @RequestMapping(value = "/getUserByJson",method = RequestMethod.POST)
    String getUserByJson(@RequestBody String data){
        return "Json is " + data;
    }
    
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setName("小明");
    	user.setPassword("123456789");
        return user;
    }

}

