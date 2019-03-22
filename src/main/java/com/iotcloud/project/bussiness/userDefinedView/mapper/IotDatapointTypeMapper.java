package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotDatapointType;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotDatapointTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotDatapointTypeMapper {
    int countByExample(IotDatapointTypeExample example);

    int deleteByExample(IotDatapointTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotDatapointType record);

    int insertSelective(IotDatapointType record);

    List<IotDatapointType> selectByExample(IotDatapointTypeExample example);

    IotDatapointType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotDatapointType record, @Param("example") IotDatapointTypeExample example);

    int updateByExample(@Param("record") IotDatapointType record, @Param("example") IotDatapointTypeExample example);

    int updateByPrimaryKeySelective(IotDatapointType record);

    int updateByPrimaryKey(IotDatapointType record);
}