package com.penny.mqttserver.mapper;

import com.penny.mqttserver.po.ProtocolConfigDetail;
import com.penny.mqttserver.po.ProtocolConfigDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolConfigDetailMapper {
    long countByExample(ProtocolConfigDetailExample example);

    int deleteByExample(ProtocolConfigDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProtocolConfigDetail record);

    int insertSelective(ProtocolConfigDetail record);

    List<ProtocolConfigDetail> selectByExample(ProtocolConfigDetailExample example);

    ProtocolConfigDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProtocolConfigDetail record, @Param("example") ProtocolConfigDetailExample example);

    int updateByExample(@Param("record") ProtocolConfigDetail record, @Param("example") ProtocolConfigDetailExample example);

    int updateByPrimaryKeySelective(ProtocolConfigDetail record);

    int updateByPrimaryKey(ProtocolConfigDetail record);
}