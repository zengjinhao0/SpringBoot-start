package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzTriggers;
import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzTriggersMapper {
    int countByExample(QrtzTriggersExample example);

    int deleteByExample(QrtzTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    QrtzTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}