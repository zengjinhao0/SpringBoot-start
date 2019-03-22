package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotTenant;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotTenantMapper {
    int countByExample(IotTenantExample example);

    int deleteByExample(IotTenantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotTenant record);

    int insertSelective(IotTenant record);

    List<IotTenant> selectByExample(IotTenantExample example);

    IotTenant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotTenant record, @Param("example") IotTenantExample example);

    int updateByExample(@Param("record") IotTenant record, @Param("example") IotTenantExample example);

    int updateByPrimaryKeySelective(IotTenant record);

    int updateByPrimaryKey(IotTenant record);
}