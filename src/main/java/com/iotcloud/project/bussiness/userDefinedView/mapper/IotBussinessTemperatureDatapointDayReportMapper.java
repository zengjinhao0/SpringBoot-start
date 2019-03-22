package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTemperatureDatapointDayReport;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTemperatureDatapointDayReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessTemperatureDatapointDayReportMapper {
    int countByExample(IotBussinessTemperatureDatapointDayReportExample example);

    int deleteByExample(IotBussinessTemperatureDatapointDayReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessTemperatureDatapointDayReport record);

    int insertSelective(IotBussinessTemperatureDatapointDayReport record);

    List<IotBussinessTemperatureDatapointDayReport> selectByExample(IotBussinessTemperatureDatapointDayReportExample example);

    IotBussinessTemperatureDatapointDayReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessTemperatureDatapointDayReport record, @Param("example") IotBussinessTemperatureDatapointDayReportExample example);

    int updateByExample(@Param("record") IotBussinessTemperatureDatapointDayReport record, @Param("example") IotBussinessTemperatureDatapointDayReportExample example);

    int updateByPrimaryKeySelective(IotBussinessTemperatureDatapointDayReport record);

    int updateByPrimaryKey(IotBussinessTemperatureDatapointDayReport record);
}