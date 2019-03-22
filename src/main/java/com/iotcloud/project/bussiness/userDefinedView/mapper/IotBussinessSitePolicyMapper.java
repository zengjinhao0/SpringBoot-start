package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessSitePolicy;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessSitePolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessSitePolicyMapper {
    int countByExample(IotBussinessSitePolicyExample example);

    int deleteByExample(IotBussinessSitePolicyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessSitePolicy record);

    int insertSelective(IotBussinessSitePolicy record);

    List<IotBussinessSitePolicy> selectByExample(IotBussinessSitePolicyExample example);

    IotBussinessSitePolicy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessSitePolicy record, @Param("example") IotBussinessSitePolicyExample example);

    int updateByExample(@Param("record") IotBussinessSitePolicy record, @Param("example") IotBussinessSitePolicyExample example);

    int updateByPrimaryKeySelective(IotBussinessSitePolicy record);

    int updateByPrimaryKey(IotBussinessSitePolicy record);
}