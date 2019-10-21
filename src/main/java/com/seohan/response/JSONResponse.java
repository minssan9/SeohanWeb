package com.seohan.response;

import lombok.Data;

@Data
public class JSONResponse<T> {
    private int code;
    private String msg;
    private T data;

    public JSONResponse() {
    }

    public JSONResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}