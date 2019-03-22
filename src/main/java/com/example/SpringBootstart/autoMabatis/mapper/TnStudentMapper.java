package com.example.SpringBootstart.autoMabatis.mapper;

import com.example.SpringBootstart.autoMabatis.bean.TnStudent;
import com.example.SpringBootstart.autoMabatis.bean.TnStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnStudentMapper {
    long countByExample(TnStudentExample example);

    int deleteByExample(TnStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TnStudent record);

    int insertSelective(TnStudent record);

    List<TnStudent> selectByExample(TnStudentExample example);

    TnStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TnStudent record, @Param("example") TnStudentExample example);

    int updateByExample(@Param("record") TnStudent record, @Param("example") TnStudentExample example);

    int updateByPrimaryKeySelective(TnStudent record);

    int updateByPrimaryKey(TnStudent record);
}