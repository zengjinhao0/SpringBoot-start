package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.DayReport;
import com.iotcloud.project.bussiness.userDefinedView.domain.DayReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DayReportMapper {
    int countByExample(DayReportExample example);

    int deleteByExample(DayReportExample example);

    int insert(DayReport record);

    int insertSelective(DayReport record);

    List<DayReport> selectByExample(DayReportExample example);

    int updateByExampleSelective(@Param("record") DayReport record, @Param("example") DayReportExample example);

    int updateByExample(@Param("record") DayReport record, @Param("example") DayReportExample example);
}