package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTagRelt;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessTagReltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessTagReltMapper {
    int countByExample(IotBussinessTagReltExample example);

    int deleteByExample(IotBussinessTagReltExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessTagRelt record);

    int insertSelective(IotBussinessTagRelt record);

    List<IotBussinessTagRelt> selectByExample(IotBussinessTagReltExample example);

    IotBussinessTagRelt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessTagRelt record, @Param("example") IotBussinessTagReltExample example);

    int updateByExample(@Param("record") IotBussinessTagRelt record, @Param("example") IotBussinessTagReltExample example);

    int updateByPrimaryKeySelective(IotBussinessTagRelt record);

    int updateByPrimaryKey(IotBussinessTagRelt record);
}