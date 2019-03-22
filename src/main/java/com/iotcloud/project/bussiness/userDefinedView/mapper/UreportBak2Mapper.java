package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.UreportBak2;
import com.iotcloud.project.bussiness.userDefinedView.domain.UreportBak2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UreportBak2Mapper {
    int countByExample(UreportBak2Example example);

    int deleteByExample(UreportBak2Example example);

    int insert(UreportBak2 record);

    int insertSelective(UreportBak2 record);

    List<UreportBak2> selectByExampleWithBLOBs(UreportBak2Example example);

    List<UreportBak2> selectByExample(UreportBak2Example example);

    int updateByExampleSelective(@Param("record") UreportBak2 record, @Param("example") UreportBak2Example example);

    int updateByExampleWithBLOBs(@Param("record") UreportBak2 record, @Param("example") UreportBak2Example example);

    int updateByExample(@Param("record") UreportBak2 record, @Param("example") UreportBak2Example example);
}