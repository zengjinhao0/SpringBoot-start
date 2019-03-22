package com.example.SpringBootstart.autoMabatis.mapper;

import com.example.SpringBootstart.autoMabatis.bean.TnTeacher;
import com.example.SpringBootstart.autoMabatis.bean.TnTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnTeacherMapper {
    long countByExample(TnTeacherExample example);

    int deleteByExample(TnTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TnTeacher record);

    int insertSelective(TnTeacher record);

    List<TnTeacher> selectByExample(TnTeacherExample example);

    TnTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TnTeacher record, @Param("example") TnTeacherExample example);

    int updateByExample(@Param("record") TnTeacher record, @Param("example") TnTeacherExample example);

    int updateByPrimaryKeySelective(TnTeacher record);

    int updateByPrimaryKey(TnTeacher record);
}