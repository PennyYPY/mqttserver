package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.DevStatus;
import com.penny.mqttserver.po.DevStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevStatusMapper {
    long countByExample(DevStatusExample example);

    int deleteByExample(DevStatusExample example);

    int deleteByPrimaryKey(String id);

    int insert(DevStatus record);

    int insertSelective(DevStatus record);

    List<DevStatus> selectByExample(DevStatusExample example);

    DevStatus selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DevStatus record, @Param("example") DevStatusExample example);

    int updateByExample(@Param("record") DevStatus record, @Param("example") DevStatusExample example);

    int updateByPrimaryKeySelective(DevStatus record);

    int updateByPrimaryKey(DevStatus record);
}