package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysOperLog;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysOperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOperLogMapper {
    int countByExample(SysOperLogExample example);

    int deleteByExample(SysOperLogExample example);

    int deleteByPrimaryKey(Integer operId);

    int insert(SysOperLog record);

    int insertSelective(SysOperLog record);

    List<SysOperLog> selectByExample(SysOperLogExample example);

    SysOperLog selectByPrimaryKey(Integer operId);

    int updateByExampleSelective(@Param("record") SysOperLog record, @Param("example") SysOperLogExample example);

    int updateByExample(@Param("record") SysOperLog record, @Param("example") SysOperLogExample example);

    int updateByPrimaryKeySelective(SysOperLog record);

    int updateByPrimaryKey(SysOperLog record);
}