package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzSchedulerState;
import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzSchedulerStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzSchedulerStateMapper {
    int countByExample(QrtzSchedulerStateExample example);

    int deleteByExample(QrtzSchedulerStateExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    List<QrtzSchedulerState> selectByExample(QrtzSchedulerStateExample example);

    QrtzSchedulerState selectByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int updateByExampleSelective(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByExample(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}