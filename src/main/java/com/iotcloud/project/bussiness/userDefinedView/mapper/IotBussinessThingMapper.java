package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessThing;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessThingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessThingMapper {
    int countByExample(IotBussinessThingExample example);

    int deleteByExample(IotBussinessThingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessThing record);

    int insertSelective(IotBussinessThing record);

    List<IotBussinessThing> selectByExample(IotBussinessThingExample example);

    IotBussinessThing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessThing record, @Param("example") IotBussinessThingExample example);

    int updateByExample(@Param("record") IotBussinessThing record, @Param("example") IotBussinessThingExample example);

    int updateByPrimaryKeySelective(IotBussinessThing record);

    int updateByPrimaryKey(IotBussinessThing record);
}