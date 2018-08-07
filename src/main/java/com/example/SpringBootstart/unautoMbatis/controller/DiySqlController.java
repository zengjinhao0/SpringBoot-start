package com.example.SpringBootstart.unautoMbatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootstart.unautoMbatis.bean.TnStudent;
import com.example.SpringBootstart.unautoMbatis.service.ITnStudentBiz;

@RestController  
@RequestMapping("/student")  
public class DiySqlController {
    private @Autowired ITnStudentBiz tnStudentBiz;  
    @RequestMapping("/saveStudent")  
    public String saveStudent(){  
        String result = "";  
        TnStudent tnStudent = new TnStudent("simba",30);  
        try {  
            tnStudentBiz.saveTnStudent(tnStudent);  
            result = "插入成功";  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
            result = "插入失败";  
        }  
        return result;
    }  
    @RequestMapping("/loadStudent")  
    public String loadStudent(Integer id){  
        TnStudent student = tnStudentBiz.loadTnStudentById(id);  
        return  "name:" + student.getName() +" age:"+ student.getAge();
    }

}  