package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.DevAlarmData;
import com.penny.mqttserver.po.DevAlarmDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevAlarmDataMapper {
    long countByExample(DevAlarmDataExample example);

    int deleteByExample(DevAlarmDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DevAlarmData record);

    int insertSelective(DevAlarmData record);

    List<DevAlarmData> selectByExample(DevAlarmDataExample example);

    DevAlarmData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DevAlarmData record, @Param("example") DevAlarmDataExample example);

    int updateByExample(@Param("record") DevAlarmData record, @Param("example") DevAlarmDataExample example);

    int updateByPrimaryKeySelective(DevAlarmData record);

    int updateByPrimaryKey(DevAlarmData record);
}