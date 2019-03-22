package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDatapointTemplate;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDatapointTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkDatapointTemplateMapper {
    int countByExample(IotWorkDatapointTemplateExample example);

    int deleteByExample(IotWorkDatapointTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkDatapointTemplate record);

    int insertSelective(IotWorkDatapointTemplate record);

    List<IotWorkDatapointTemplate> selectByExample(IotWorkDatapointTemplateExample example);

    IotWorkDatapointTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkDatapointTemplate record, @Param("example") IotWorkDatapointTemplateExample example);

    int updateByExample(@Param("record") IotWorkDatapointTemplate record, @Param("example") IotWorkDatapointTemplateExample example);

    int updateByPrimaryKeySelective(IotWorkDatapointTemplate record);

    int updateByPrimaryKey(IotWorkDatapointTemplate record);
}