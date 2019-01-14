package com.penny.mqttserver.po;

import java.util.Date;

public class HistoricalData {
    private String id;

    private String snCode;

    private String protocolVersion;

    private String deviceData;

    private Date dataTime;

    private Integer offsetNumber;

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

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion == null ? null : protocolVersion.trim();
    }

    public String getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(String deviceData) {
        this.deviceData = deviceData == null ? null : deviceData.trim();
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getOffsetNumber() {
        return offsetNumber;
    }

    public void setOffsetNumber(Integer offsetNumber) {
        this.offsetNumber = offsetNumber;
    }
}