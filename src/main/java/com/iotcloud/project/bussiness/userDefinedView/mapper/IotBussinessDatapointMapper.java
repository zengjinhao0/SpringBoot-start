package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDatapoint;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDatapointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessDatapointMapper {
    int countByExample(IotBussinessDatapointExample example);

    int deleteByExample(IotBussinessDatapointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessDatapoint record);

    int insertSelective(IotBussinessDatapoint record);

    List<IotBussinessDatapoint> selectByExample(IotBussinessDatapointExample example);

    IotBussinessDatapoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessDatapoint record, @Param("example") IotBussinessDatapointExample example);

    int updateByExample(@Param("record") IotBussinessDatapoint record, @Param("example") IotBussinessDatapointExample example);

    int updateByPrimaryKeySelective(IotBussinessDatapoint record);

    int updateByPrimaryKey(IotBussinessDatapoint record);
}