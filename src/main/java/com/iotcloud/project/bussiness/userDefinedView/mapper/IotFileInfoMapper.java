package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.IotFileInfo;
import com.iotcloud.project.bussiness.userDefinedView.domain.IotFileInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotFileInfoMapper {
    int countByExample(IotFileInfoExample example);

    int deleteByExample(IotFileInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotFileInfo record);

    int insertSelective(IotFileInfo record);

    List<IotFileInfo> selectByExample(IotFileInfoExample example);

    IotFileInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotFileInfo record, @Param("example") IotFileInfoExample example);

    int updateByExample(@Param("record") IotFileInfo record, @Param("example") IotFileInfoExample example);

    int updateByPrimaryKeySelective(IotFileInfo record);

    int updateByPrimaryKey(IotFileInfo record);
}