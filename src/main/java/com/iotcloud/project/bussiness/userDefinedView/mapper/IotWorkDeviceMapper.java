package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDevice;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkDeviceMapper {
    int countByExample(IotWorkDeviceExample example);

    int deleteByExample(IotWorkDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkDevice record);

    int insertSelective(IotWorkDevice record);

    List<IotWorkDevice> selectByExample(IotWorkDeviceExample example);

    IotWorkDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkDevice record, @Param("example") IotWorkDeviceExample example);

    int updateByExample(@Param("record") IotWorkDevice record, @Param("example") IotWorkDeviceExample example);

    int updateByPrimaryKeySelective(IotWorkDevice record);

    int updateByPrimaryKey(IotWorkDevice record);
}