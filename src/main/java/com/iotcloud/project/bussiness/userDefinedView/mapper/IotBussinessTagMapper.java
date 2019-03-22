package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTag;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessTagMapper {
    int countByExample(IotBussinessTagExample example);

    int deleteByExample(IotBussinessTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessTag record);

    int insertSelective(IotBussinessTag record);

    List<IotBussinessTag> selectByExample(IotBussinessTagExample example);

    IotBussinessTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessTag record, @Param("example") IotBussinessTagExample example);

    int updateByExample(@Param("record") IotBussinessTag record, @Param("example") IotBussinessTagExample example);

    int updateByPrimaryKeySelective(IotBussinessTag record);

    int updateByPrimaryKey(IotBussinessTag record);
}