package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.DevVerifyData;
import com.penny.mqttserver.po.DevVerifyDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevVerifyDataMapper {
    long countByExample(DevVerifyDataExample example);

    int deleteByExample(DevVerifyDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DevVerifyData record);

    int insertSelective(DevVerifyData record);

    List<DevVerifyData> selectByExample(DevVerifyDataExample example);

    DevVerifyData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DevVerifyData record, @Param("example") DevVerifyDataExample example);

    int updateByExample(@Param("record") DevVerifyData record, @Param("example") DevVerifyDataExample example);

    int updateByPrimaryKeySelective(DevVerifyData record);

    int updateByPrimaryKey(DevVerifyData record);
}