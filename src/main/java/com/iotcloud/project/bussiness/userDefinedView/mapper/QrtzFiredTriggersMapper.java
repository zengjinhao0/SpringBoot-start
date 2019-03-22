package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzFiredTriggers;
import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzFiredTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzFiredTriggersMapper {
    int countByExample(QrtzFiredTriggersExample example);

    int deleteByExample(QrtzFiredTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("entryId") String entryId);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    List<QrtzFiredTriggers> selectByExample(QrtzFiredTriggersExample example);

    QrtzFiredTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("entryId") String entryId);

    int updateByExampleSelective(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByExample(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}