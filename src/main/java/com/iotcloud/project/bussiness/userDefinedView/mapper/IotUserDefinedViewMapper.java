package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotUserDefinedView;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotUserDefinedViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotUserDefinedViewMapper {
    int countByExample(IotUserDefinedViewExample example);

    int deleteByExample(IotUserDefinedViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotUserDefinedView record);

    int insertSelective(IotUserDefinedView record);

    List<IotUserDefinedView> selectByExample(IotUserDefinedViewExample example);

    IotUserDefinedView selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotUserDefinedView record, @Param("example") IotUserDefinedViewExample example);

    int updateByExample(@Param("record") IotUserDefinedView record, @Param("example") IotUserDefinedViewExample example);

    int updateByPrimaryKeySelective(IotUserDefinedView record);

    int updateByPrimaryKey(IotUserDefinedView record);
}