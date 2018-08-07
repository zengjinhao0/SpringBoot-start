package com.example.SpringBootstart.unautoMbatis.service;

import com.example.SpringBootstart.unautoMbatis.dao.ITnTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootstart.unautoMbatis.bean.TnTeacher;

@Service("tnTeacherBiz")  
public class TnTeacherBizImpl implements ITnTeacherBiz {  
    private @Autowired
    ITnTeacherMapper teacherMapper;
    @Override  
    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)  
    public void saveTnTeacher(TnTeacher tnTeacher) throws Exception{  
        teacherMapper.saveTnTeacher(tnTeacher);  
        //throw new Exception("错误！");
    }  
}  