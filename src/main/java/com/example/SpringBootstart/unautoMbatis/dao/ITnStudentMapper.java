package com.example.SpringBootstart.unautoMbatis.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.SpringBootstart.unautoMbatis.bean.TnStudent;

@Mapper  //说明这是一个mapper
public interface ITnStudentMapper {  


	@Insert("insert into tn_student(name,age) values (#{name},#{age})")  
	void saveTnStudent(TnStudent tnStudent);  
	@Select("select * from tn_student where id = #{id}")  
	TnStudent loadTnStudentById(Integer id);  
}  