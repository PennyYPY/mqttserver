package com.penny.mqttserver.po;

import java.util.Date;

public class DevStatus {
    private String id;

    private String snCode;

    private Date heartTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSnCode() {
        return snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode == null ? null : snCode.trim();
    }

    public Date getHeartTime() {
        return heartTime;
    }

    public void setHeartTime(Date heartTime) {
        this.heartTime = heartTime;
    }
}