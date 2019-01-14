package com.penny.mqttserver.po;

public class ProtocolConfigDetail {
    private String id;

    private String snCode;

    private String protocolVersion;

    private Integer offset;

    private String dataName;

    private Integer isVisible;

    private Integer isAlarmed;

    private String deleted;

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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getIsAlarmed() {
        return isAlarmed;
    }

    public void setIsAlarmed(Integer isAlarmed) {
        this.isAlarmed = isAlarmed;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}