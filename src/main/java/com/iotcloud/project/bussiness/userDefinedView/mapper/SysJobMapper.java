package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysJob;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobMapper {
    int countByExample(SysJobExample example);

    int deleteByExample(SysJobExample example);

    int deleteByPrimaryKey(@Param("jobId") Integer jobId, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    SysJob selectByPrimaryKey(@Param("jobId") Integer jobId, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int updateByExampleSelective(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByExample(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}