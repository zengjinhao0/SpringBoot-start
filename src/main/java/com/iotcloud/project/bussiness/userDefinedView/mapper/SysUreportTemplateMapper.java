package com.iotcloud.project.bussiness.userDefinedView.mapper;

import com.iotcloud.project.bussiness.userDefinedView.domain.SysUreportTemplate;
import com.iotcloud.project.bussiness.userDefinedView.domain.SysUreportTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUreportTemplateMapper {
    int countByExample(SysUreportTemplateExample example);

    int deleteByExample(SysUreportTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUreportTemplate record);

    int insertSelective(SysUreportTemplate record);

    List<SysUreportTemplate> selectByExampleWithBLOBs(SysUreportTemplateExample example);

    List<SysUreportTemplate> selectByExample(SysUreportTemplateExample example);

    SysUreportTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUreportTemplate record, @Param("example") SysUreportTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUreportTemplate record, @Param("example") SysUreportTemplateExample example);

    int updateByExample(@Param("record") SysUreportTemplate record, @Param("example") SysUreportTemplateExample example);

    int updateByPrimaryKeySelective(SysUreportTemplate record);

    int updateByPrimaryKeyWithBLOBs(SysUreportTemplate record);

    int updateByPrimaryKey(SysUreportTemplate record);
}