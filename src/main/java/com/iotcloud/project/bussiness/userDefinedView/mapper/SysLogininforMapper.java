package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysLogininfor;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysLogininforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogininforMapper {
    int countByExample(SysLogininforExample example);

    int deleteByExample(SysLogininforExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(SysLogininfor record);

    int insertSelective(SysLogininfor record);

    List<SysLogininfor> selectByExample(SysLogininforExample example);

    SysLogininfor selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") SysLogininfor record, @Param("example") SysLogininforExample example);

    int updateByExample(@Param("record") SysLogininfor record, @Param("example") SysLogininforExample example);

    int updateByPrimaryKeySelective(SysLogininfor record);

    int updateByPrimaryKey(SysLogininfor record);
}