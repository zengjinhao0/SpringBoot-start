package com.example.SpringBootstart.unautoMbatis.dao;

import org.apache.ibatis.annotations.Insert;  
import org.apache.ibatis.annotations.Mapper;

import com.example.SpringBootstart.unautoMbatis.bean.TnTeacher;

  
@Mapper  
public interface ITnTeacherMapper {  
    @Insert("insert into tn_teacher(tea_name,tea_age) values (#{teaName},#{teaAge})")  
    void saveTnTeacher(TnTeacher tnTeacher);  
}  