package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysPost;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPostMapper {
    int countByExample(SysPostExample example);

    int deleteByExample(SysPostExample example);

    int deleteByPrimaryKey(Integer postId);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    List<SysPost> selectByExample(SysPostExample example);

    SysPost selectByPrimaryKey(Integer postId);

    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}