package com.penny.mqttserver.config;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * @ClassName MqttGateway
 * @Description
 * @Date 2019/1/15 上午9:50
 * @Created by yupeiying
 */

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttGateway {
    void sendMessage(String data,@Header(MqttHeaders.TOPIC) String topic);
}
