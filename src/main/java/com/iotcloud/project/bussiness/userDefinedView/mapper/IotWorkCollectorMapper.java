package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkCollector;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkCollectorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkCollectorMapper {
    int countByExample(IotWorkCollectorExample example);

    int deleteByExample(IotWorkCollectorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkCollector record);

    int insertSelective(IotWorkCollector record);

    List<IotWorkCollector> selectByExample(IotWorkCollectorExample example);

    IotWorkCollector selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkCollector record, @Param("example") IotWorkCollectorExample example);

    int updateByExample(@Param("record") IotWorkCollector record, @Param("example") IotWorkCollectorExample example);

    int updateByPrimaryKeySelective(IotWorkCollector record);

    int updateByPrimaryKey(IotWorkCollector record);
}