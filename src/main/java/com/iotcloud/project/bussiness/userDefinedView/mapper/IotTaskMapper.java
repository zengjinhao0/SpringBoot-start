package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotTask;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotTaskMapper {
    int countByExample(IotTaskExample example);

    int deleteByExample(IotTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotTask record);

    int insertSelective(IotTask record);

    List<IotTask> selectByExample(IotTaskExample example);

    IotTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotTask record, @Param("example") IotTaskExample example);

    int updateByExample(@Param("record") IotTask record, @Param("example") IotTaskExample example);

    int updateByPrimaryKeySelective(IotTask record);

    int updateByPrimaryKey(IotTask record);
}