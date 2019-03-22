package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysJobLog;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobLogMapper {
    int countByExample(SysJobLogExample example);

    int deleteByExample(SysJobLogExample example);

    int deleteByPrimaryKey(Integer jobLogId);

    int insert(SysJobLog record);

    int insertSelective(SysJobLog record);

    List<SysJobLog> selectByExampleWithBLOBs(SysJobLogExample example);

    List<SysJobLog> selectByExample(SysJobLogExample example);

    SysJobLog selectByPrimaryKey(Integer jobLogId);

    int updateByExampleSelective(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByExample(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByPrimaryKeySelective(SysJobLog record);

    int updateByPrimaryKeyWithBLOBs(SysJobLog record);

    int updateByPrimaryKey(SysJobLog record);
}