package com.penny.mqttserver.controller;

import com.penny.mqttserver.mqttconfig.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    MqttGateway mqttGateway;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendTest(String sendData,String topic){
        mqttGateway.sendMessage(sendData,topic);
        return "OK";
    }

}
