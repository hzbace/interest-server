package com.interest.annotation.handler;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterestException implements Serializable {

    private String createTime;

    private String location;

    private String message;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
