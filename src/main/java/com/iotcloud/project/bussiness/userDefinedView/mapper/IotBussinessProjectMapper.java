package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessProject;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessProjectMapper {
    int countByExample(IotBussinessProjectExample example);

    int deleteByExample(IotBussinessProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessProject record);

    int insertSelective(IotBussinessProject record);

    List<IotBussinessProject> selectByExample(IotBussinessProjectExample example);

    IotBussinessProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessProject record, @Param("example") IotBussinessProjectExample example);

    int updateByExample(@Param("record") IotBussinessProject record, @Param("example") IotBussinessProjectExample example);

    int updateByPrimaryKeySelective(IotBussinessProject record);

    int updateByPrimaryKey(IotBussinessProject record);
}