package com.example.SpringBootstart.unautoMbatis.service;

import com.example.SpringBootstart.unautoMbatis.bean.TnStudent;

public interface ITnStudentBiz {  
    /** 
     * 插入数据 
     * @param tnStudent 
     * @throws Exception 
     */  
    void saveTnStudent(TnStudent tnStudent) throws Exception;  
    /** 
     * 查询数据 
     * @param id 
     * @return 
     */  
    TnStudent loadTnStudentById(Integer id);  
}  