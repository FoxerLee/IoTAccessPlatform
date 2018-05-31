package com.lab409.socket.demoServer.model;

import com.lab409.socket.demoServer.enums.SensorType;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Sensor implements Serializable {
    private Long id;
    private SensorGroup sensorGroup;
    private SensorType type;
    private String descr;
    private String host;
    private String port;
    private String latestMsg;
    private String state;
    private Timestamp changedTime;
    private List<SensorMsg> sensorMsgs;

    public Sensor() {}

    public Sensor(Sensor sensor) {
        this.id = sensor.id;
        this.sensorGroup = sensor.sensorGroup;
        this.type = sensor.type;
        this.host = sensor.host;
        this.port = sensor.port;
        this.latestMsg = sensor.latestMsg;
        this.state = sensor.state;
        this.descr = sensor.descr;
        this.changedTime = sensor.changedTime;
        this.sensorMsgs = sensor.sensorMsgs;
    }

    public Sensor(Long id, SensorGroup sensorGroup, SensorType type, String descr, String host, String port, String latestMsg, String state, Timestamp changedTime, List<SensorMsg> sensorMsgs) {
        this.id = id;
        this.sensorGroup = sensorGroup;
        this.type = type;
        this.descr = descr;
        this.host = host;
        this.port = port;
        this.latestMsg = latestMsg;
        this.state = state;
        this.changedTime = changedTime;
        this.sensorMsgs = sensorMsgs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SensorGroup getSensorGroup() {
        return sensorGroup;
    }

    public void setSensorGroup(SensorGroup sensorGroup) {
        this.sensorGroup = sensorGroup;
    }

    public SensorType getType() {
        return type;
    }

    public void setType(SensorType type) {
        this.type = type;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getLatestMsg() {
        return latestMsg;
    }

    public void setLatestMsg(String latestMsg) {
        this.latestMsg = latestMsg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(Timestamp changedTime) {
        this.changedTime = changedTime;
    }

    public List<SensorMsg> getSensorMsgs() {
        return sensorMsgs;
    }

    public void setSensorMsgs(List<SensorMsg> sensorMsgs) {
        this.sensorMsgs = sensorMsgs;
    }

    @Override
    public String toString() {
        return "id:" + id + " type: " + type.name() + " descr:" + descr + " host:" + host + " port: " + port + " msg: " + latestMsg + " state" + state + " changedTime: " + changedTime;
    }
}