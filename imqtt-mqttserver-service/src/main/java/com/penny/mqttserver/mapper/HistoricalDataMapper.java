package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.HistoricalData;
import com.penny.mqttserver.po.HistoricalDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoricalDataMapper {
    long countByExample(HistoricalDataExample example);

    int deleteByExample(HistoricalDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(HistoricalData record);

    int insertSelective(HistoricalData record);

    List<HistoricalData> selectByExample(HistoricalDataExample example);

    HistoricalData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HistoricalData record, @Param("example") HistoricalDataExample example);

    int updateByExample(@Param("record") HistoricalData record, @Param("example") HistoricalDataExample example);

    int updateByPrimaryKeySelective(HistoricalData record);

    int updateByPrimaryKey(HistoricalData record);
}