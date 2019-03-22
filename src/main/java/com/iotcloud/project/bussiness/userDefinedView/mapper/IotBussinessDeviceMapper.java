package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDevice;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessDeviceMapper {
    int countByExample(IotBussinessDeviceExample example);

    int deleteByExample(IotBussinessDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessDevice record);

    int insertSelective(IotBussinessDevice record);

    List<IotBussinessDevice> selectByExample(IotBussinessDeviceExample example);

    IotBussinessDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessDevice record, @Param("example") IotBussinessDeviceExample example);

    int updateByExample(@Param("record") IotBussinessDevice record, @Param("example") IotBussinessDeviceExample example);

    int updateByPrimaryKeySelective(IotBussinessDevice record);

    int updateByPrimaryKey(IotBussinessDevice record);
}