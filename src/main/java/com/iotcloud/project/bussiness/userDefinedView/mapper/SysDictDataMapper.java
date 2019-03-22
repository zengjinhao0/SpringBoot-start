package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysDictData;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysDictDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictDataMapper {
    int countByExample(SysDictDataExample example);

    int deleteByExample(SysDictDataExample example);

    int deleteByPrimaryKey(Integer dictCode);

    int insert(SysDictData record);

    int insertSelective(SysDictData record);

    List<SysDictData> selectByExample(SysDictDataExample example);

    SysDictData selectByPrimaryKey(Integer dictCode);

    int updateByExampleSelective(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    int updateByExample(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    int updateByPrimaryKeySelective(SysDictData record);

    int updateByPrimaryKey(SysDictData record);
}