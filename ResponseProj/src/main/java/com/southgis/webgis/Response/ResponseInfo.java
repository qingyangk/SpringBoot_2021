package com.southgis.webgis.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.southgis.webgis.Response.entity.EnumErrCode;

import java.io.Serializable;

public class ResponseInfo implements Serializable {

    @JsonProperty(value = "code")
    public int errCode;

    @JsonProperty(value = "description")
    public String description = "";

    @JsonProperty(value = "data")
    public Object data = null;

    /**
     * 构造函数
     */
    public ResponseInfo(){
    }

    public ResponseInfo(EnumErrCode enumErrCode, String description, Object data) {
        this.errCode = enumErrCode.getValue();
        this.description = description == null || description.isEmpty() ? enumErrCode.getMessage() : description;
        this.data = data;
    }

    /**
     * get and set
     */
    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
