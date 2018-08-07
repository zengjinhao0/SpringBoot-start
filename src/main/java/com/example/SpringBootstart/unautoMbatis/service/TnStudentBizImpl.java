package com.example.SpringBootstart.unautoMbatis.service;

import com.example.SpringBootstart.unautoMbatis.dao.ITnStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootstart.unautoMbatis.bean.TnStudent;
import com.example.SpringBootstart.unautoMbatis.bean.TnTeacher;

@Service("tnStudentBiz")  
public class TnStudentBizImpl implements ITnStudentBiz {  
    private @Autowired
    ITnStudentMapper studentMapper;
    private @Autowired ITnTeacherBiz tnTeacherBiz;  
    @Override  
    @Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)  //添加一个事务
    public void saveTnStudent(TnStudent tnStudent) throws Exception{  
        studentMapper.saveTnStudent(tnStudent);  
        TnTeacher tnTeacher = new TnTeacher("华晨曦",2);  
        try {  
            tnTeacherBiz.saveTnTeacher(tnTeacher);
        } catch (Exception e) {  
          e.printStackTrace();  
        }  
    }
    @Override  
    public TnStudent loadTnStudentById(Integer id) {  
        // TODO Auto-generated method stub  
        return studentMapper.loadTnStudentById(id);  
    }
}  