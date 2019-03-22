package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysUserPost;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysUserPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPostMapper {
    int countByExample(SysUserPostExample example);

    int deleteByExample(SysUserPostExample example);

    int deleteByPrimaryKey(@Param("userId") String userId, @Param("postId") String postId);

    int insert(SysUserPost record);

    int insertSelective(SysUserPost record);

    List<SysUserPost> selectByExample(SysUserPostExample example);

    int updateByExampleSelective(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);

    int updateByExample(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);
}