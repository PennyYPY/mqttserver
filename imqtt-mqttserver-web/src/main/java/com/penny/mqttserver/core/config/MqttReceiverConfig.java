package com.penny.mqttserver.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

/**
 * @ClassName MqttReceiverConfig
 * @Description mqtt消息订阅服务类
 * @Date 2019/1/11 下午3:58
 * @Created by yupeiying
 */

@Configuration
@IntegrationComponentScan
public class MqttReceiverConfig {

    @Value("${spring.mqtt.username}")
    private String userName;
    @Value("${spring.mqtt.password}")
    private String password;
    @Value("${spring.mqtt.url}")
    private String hostUrl;
    @Value("${spring.mqtt.client.id}")
    private String clientId;
    @Value("${spring.matt.topic}")
    private String defaultTopic;
    @Value("${}")
    private int completionTimeOut;

    @Autowired
    private MqttSenderConfig mqttSenderConfig;

    //接收通道配置
    @Bean
    public MessageChannel mqttInputChannel(){
        return new DirectChannel();
    }

    @Bean
    public MessageProducer inbound(){
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter("",mqttSenderConfig.mqttClientFactory(),
                        new String[]{"监听的主题配置","",""});

        //需要配置adapter各种参数
        return adapter;
    }

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler(){
        return new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {
                String topic  = message.getHeaders().get("").toString();
                String payload = message.getPayload().toString();
            }
        };
    }

}
