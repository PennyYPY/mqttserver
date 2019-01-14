package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.UserRefDevice;
import com.penny.mqttserver.po.UserRefDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRefDeviceMapper {
    long countByExample(UserRefDeviceExample example);

    int deleteByExample(UserRefDeviceExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserRefDevice record);

    int insertSelective(UserRefDevice record);

    List<UserRefDevice> selectByExample(UserRefDeviceExample example);

    UserRefDevice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserRefDevice record, @Param("example") UserRefDeviceExample example);

    int updateByExample(@Param("record") UserRefDevice record, @Param("example") UserRefDeviceExample example);

    int updateByPrimaryKeySelective(UserRefDevice record);

    int updateByPrimaryKey(UserRefDevice record);
}