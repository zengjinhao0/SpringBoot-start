package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkCollectorPort;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkCollectorPortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkCollectorPortMapper {
    int countByExample(IotWorkCollectorPortExample example);

    int deleteByExample(IotWorkCollectorPortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkCollectorPort record);

    int insertSelective(IotWorkCollectorPort record);

    List<IotWorkCollectorPort> selectByExample(IotWorkCollectorPortExample example);

    IotWorkCollectorPort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkCollectorPort record, @Param("example") IotWorkCollectorPortExample example);

    int updateByExample(@Param("record") IotWorkCollectorPort record, @Param("example") IotWorkCollectorPortExample example);

    int updateByPrimaryKeySelective(IotWorkCollectorPort record);

    int updateByPrimaryKey(IotWorkCollectorPort record);
}