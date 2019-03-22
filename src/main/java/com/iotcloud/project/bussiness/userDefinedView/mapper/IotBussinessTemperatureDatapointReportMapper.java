package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTemperatureDatapointReport;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTemperatureDatapointReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessTemperatureDatapointReportMapper {
    int countByExample(IotBussinessTemperatureDatapointReportExample example);

    int deleteByExample(IotBussinessTemperatureDatapointReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessTemperatureDatapointReport record);

    int insertSelective(IotBussinessTemperatureDatapointReport record);

    List<IotBussinessTemperatureDatapointReport> selectByExample(IotBussinessTemperatureDatapointReportExample example);

    IotBussinessTemperatureDatapointReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessTemperatureDatapointReport record, @Param("example") IotBussinessTemperatureDatapointReportExample example);

    int updateByExample(@Param("record") IotBussinessTemperatureDatapointReport record, @Param("example") IotBussinessTemperatureDatapointReportExample example);

    int updateByPrimaryKeySelective(IotBussinessTemperatureDatapointReport record);

    int updateByPrimaryKey(IotBussinessTemperatureDatapointReport record);
}