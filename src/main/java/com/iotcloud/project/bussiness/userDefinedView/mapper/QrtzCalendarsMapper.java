package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzCalendars;
import com.iotcloud.project.bussiness.userDefinedView.domain.QrtzCalendarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzCalendarsMapper {
    int countByExample(QrtzCalendarsExample example);

    int deleteByExample(QrtzCalendarsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    List<QrtzCalendars> selectByExampleWithBLOBs(QrtzCalendarsExample example);

    List<QrtzCalendars> selectByExample(QrtzCalendarsExample example);

    QrtzCalendars selectByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int updateByExampleSelective(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExample(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}