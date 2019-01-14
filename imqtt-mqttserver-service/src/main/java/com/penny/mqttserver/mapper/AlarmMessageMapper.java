package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.AlarmMessage;
import com.penny.mqttserver.po.AlarmMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmMessageMapper {
    long countByExample(AlarmMessageExample example);

    int deleteByExample(AlarmMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlarmMessage record);

    int insertSelective(AlarmMessage record);

    List<AlarmMessage> selectByExample(AlarmMessageExample example);

    AlarmMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlarmMessage record, @Param("example") AlarmMessageExample example);

    int updateByExample(@Param("record") AlarmMessage record, @Param("example") AlarmMessageExample example);

    int updateByPrimaryKeySelective(AlarmMessage record);

    int updateByPrimaryKey(AlarmMessage record);
}