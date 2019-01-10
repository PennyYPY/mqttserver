package com.penny.mqttserver.mqttconfig;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttPub {

    private MqttClient client;
    private MqttTopic topic;
    private String Host = "tcp://47.94.242.70:61613";
    private String clientId = "server";

    /**构造方法ServerService()：通过MqttClient连接broker*/
    public MqttPub()throws MqttException {
        client = new MqttClient(Host,clientId,new MemoryPersistence());
        connect();
    }
    /**connect()：对连接broker进行基本配置*/
    public void connect(){
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setUserName("admin");
        options.setPassword("password".toCharArray());
        options.setConnectionTimeout(10);
        options.setKeepAliveInterval(20);
        try {
            client.setCallback(new MqttCallback());
            client.connect(options);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    /**publish():发布消息方法*/
    public void publish(MqttMessage message, String secondTopic) throws MqttException{
        topic = client.getTopic(secondTopic);
        MqttDeliveryToken token = topic.publish(message);
        token.waitForCompletion();
        System.out.println("发布完成? "+token.isComplete());
    }
}
