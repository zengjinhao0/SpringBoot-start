package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDatapoint;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDatapointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkDatapointMapper {
    int countByExample(IotWorkDatapointExample example);

    int deleteByExample(IotWorkDatapointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkDatapoint record);

    int insertSelective(IotWorkDatapoint record);

    List<IotWorkDatapoint> selectByExample(IotWorkDatapointExample example);

    IotWorkDatapoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkDatapoint record, @Param("example") IotWorkDatapointExample example);

    int updateByExample(@Param("record") IotWorkDatapoint record, @Param("example") IotWorkDatapointExample example);

    int updateByPrimaryKeySelective(IotWorkDatapoint record);

    int updateByPrimaryKey(IotWorkDatapoint record);
}