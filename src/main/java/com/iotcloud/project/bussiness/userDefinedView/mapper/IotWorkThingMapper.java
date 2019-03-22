package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkThing;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkThingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkThingMapper {
    int countByExample(IotWorkThingExample example);

    int deleteByExample(IotWorkThingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkThing record);

    int insertSelective(IotWorkThing record);

    List<IotWorkThing> selectByExample(IotWorkThingExample example);

    IotWorkThing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkThing record, @Param("example") IotWorkThingExample example);

    int updateByExample(@Param("record") IotWorkThing record, @Param("example") IotWorkThingExample example);

    int updateByPrimaryKeySelective(IotWorkThing record);

    int updateByPrimaryKey(IotWorkThing record);
}