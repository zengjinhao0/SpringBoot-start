package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysUserOnline;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysUserOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserOnlineMapper {
    int countByExample(SysUserOnlineExample example);

    int deleteByExample(SysUserOnlineExample example);

    int deleteByPrimaryKey(String sessionid);

    int insert(SysUserOnline record);

    int insertSelective(SysUserOnline record);

    List<SysUserOnline> selectByExample(SysUserOnlineExample example);

    SysUserOnline selectByPrimaryKey(String sessionid);

    int updateByExampleSelective(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

    int updateByExample(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

    int updateByPrimaryKeySelective(SysUserOnline record);

    int updateByPrimaryKey(SysUserOnline record);
}