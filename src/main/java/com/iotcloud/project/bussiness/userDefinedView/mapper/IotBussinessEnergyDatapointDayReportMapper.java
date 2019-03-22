package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessEnergyDatapointDayReport;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessEnergyDatapointDayReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessEnergyDatapointDayReportMapper {
    int countByExample(IotBussinessEnergyDatapointDayReportExample example);

    int deleteByExample(IotBussinessEnergyDatapointDayReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessEnergyDatapointDayReport record);

    int insertSelective(IotBussinessEnergyDatapointDayReport record);

    List<IotBussinessEnergyDatapointDayReport> selectByExample(IotBussinessEnergyDatapointDayReportExample example);

    IotBussinessEnergyDatapointDayReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessEnergyDatapointDayReport record, @Param("example") IotBussinessEnergyDatapointDayReportExample example);

    int updateByExample(@Param("record") IotBussinessEnergyDatapointDayReport record, @Param("example") IotBussinessEnergyDatapointDayReportExample example);

    int updateByPrimaryKeySelective(IotBussinessEnergyDatapointDayReport record);

    int updateByPrimaryKey(IotBussinessEnergyDatapointDayReport record);
}