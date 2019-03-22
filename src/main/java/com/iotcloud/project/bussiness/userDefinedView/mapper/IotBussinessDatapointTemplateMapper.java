package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDatapointTemplate;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessDatapointTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessDatapointTemplateMapper {
    int countByExample(IotBussinessDatapointTemplateExample example);

    int deleteByExample(IotBussinessDatapointTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessDatapointTemplate record);

    int insertSelective(IotBussinessDatapointTemplate record);

    List<IotBussinessDatapointTemplate> selectByExample(IotBussinessDatapointTemplateExample example);

    IotBussinessDatapointTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessDatapointTemplate record, @Param("example") IotBussinessDatapointTemplateExample example);

    int updateByExample(@Param("record") IotBussinessDatapointTemplate record, @Param("example") IotBussinessDatapointTemplateExample example);

    int updateByPrimaryKeySelective(IotBussinessDatapointTemplate record);

    int updateByPrimaryKey(IotBussinessDatapointTemplate record);
}