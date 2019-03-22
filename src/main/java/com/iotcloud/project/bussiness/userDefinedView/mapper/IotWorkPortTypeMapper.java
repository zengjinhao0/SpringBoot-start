package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkPortType;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkPortTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkPortTypeMapper {
    int countByExample(IotWorkPortTypeExample example);

    int deleteByExample(IotWorkPortTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkPortType record);

    int insertSelective(IotWorkPortType record);

    List<IotWorkPortType> selectByExample(IotWorkPortTypeExample example);

    IotWorkPortType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkPortType record, @Param("example") IotWorkPortTypeExample example);

    int updateByExample(@Param("record") IotWorkPortType record, @Param("example") IotWorkPortTypeExample example);

    int updateByPrimaryKeySelective(IotWorkPortType record);

    int updateByPrimaryKey(IotWorkPortType record);
}