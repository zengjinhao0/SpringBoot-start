package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzBlobTriggers;
import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzBlobTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzBlobTriggersMapper {
    int countByExample(QrtzBlobTriggersExample example);

    int deleteByExample(QrtzBlobTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    List<QrtzBlobTriggers> selectByExampleWithBLOBs(QrtzBlobTriggersExample example);

    List<QrtzBlobTriggers> selectByExample(QrtzBlobTriggersExample example);

    QrtzBlobTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExample(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}