package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessEnergyDatapointReport;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessEnergyDatapointReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessEnergyDatapointReportMapper {
    int countByExample(IotBussinessEnergyDatapointReportExample example);

    int deleteByExample(IotBussinessEnergyDatapointReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessEnergyDatapointReport record);

    int insertSelective(IotBussinessEnergyDatapointReport record);

    List<IotBussinessEnergyDatapointReport> selectByExample(IotBussinessEnergyDatapointReportExample example);

    IotBussinessEnergyDatapointReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessEnergyDatapointReport record, @Param("example") IotBussinessEnergyDatapointReportExample example);

    int updateByExample(@Param("record") IotBussinessEnergyDatapointReport record, @Param("example") IotBussinessEnergyDatapointReportExample example);

    int updateByPrimaryKeySelective(IotBussinessEnergyDatapointReport record);

    int updateByPrimaryKey(IotBussinessEnergyDatapointReport record);
}