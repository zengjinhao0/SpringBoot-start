package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkProject;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotWorkProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotWorkProjectMapper {
    int countByExample(IotWorkProjectExample example);

    int deleteByExample(IotWorkProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotWorkProject record);

    int insertSelective(IotWorkProject record);

    List<IotWorkProject> selectByExample(IotWorkProjectExample example);

    IotWorkProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotWorkProject record, @Param("example") IotWorkProjectExample example);

    int updateByExample(@Param("record") IotWorkProject record, @Param("example") IotWorkProjectExample example);

    int updateByPrimaryKeySelective(IotWorkProject record);

    int updateByPrimaryKey(IotWorkProject record);
}