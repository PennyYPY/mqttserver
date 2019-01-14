package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.ProtocolConfigMaster;
import com.penny.mqttserver.po.ProtocolConfigMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolConfigMasterMapper {
    long countByExample(ProtocolConfigMasterExample example);

    int deleteByExample(ProtocolConfigMasterExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProtocolConfigMaster record);

    int insertSelective(ProtocolConfigMaster record);

    List<ProtocolConfigMaster> selectByExample(ProtocolConfigMasterExample example);

    ProtocolConfigMaster selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProtocolConfigMaster record, @Param("example") ProtocolConfigMasterExample example);

    int updateByExample(@Param("record") ProtocolConfigMaster record, @Param("example") ProtocolConfigMasterExample example);

    int updateByPrimaryKeySelective(ProtocolConfigMaster record);

    int updateByPrimaryKey(ProtocolConfigMaster record);
}