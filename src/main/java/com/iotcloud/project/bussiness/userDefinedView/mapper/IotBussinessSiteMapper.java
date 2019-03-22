package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessSite;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotBussinessSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotBussinessSiteMapper {
    int countByExample(IotBussinessSiteExample example);

    int deleteByExample(IotBussinessSiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotBussinessSite record);

    int insertSelective(IotBussinessSite record);

    List<IotBussinessSite> selectByExample(IotBussinessSiteExample example);

    IotBussinessSite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotBussinessSite record, @Param("example") IotBussinessSiteExample example);

    int updateByExample(@Param("record") IotBussinessSite record, @Param("example") IotBussinessSiteExample example);

    int updateByPrimaryKeySelective(IotBussinessSite record);

    int updateByPrimaryKey(IotBussinessSite record);
}