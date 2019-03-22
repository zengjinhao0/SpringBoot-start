package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysRoleDept;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysRoleDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDeptMapper {
    int countByExample(SysRoleDeptExample example);

    int deleteByExample(SysRoleDeptExample example);

    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("deptId") Integer deptId);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    List<SysRoleDept> selectByExample(SysRoleDeptExample example);

    int updateByExampleSelective(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);

    int updateByExample(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);
}