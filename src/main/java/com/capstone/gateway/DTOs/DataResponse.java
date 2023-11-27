package com.capstone.gateway.DTOs;

public class DataResponse {
    private Integer code;
    private String status;
    private String data;

    public DataResponse() {
    }

    public DataResponse(Integer code,String status, String data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
