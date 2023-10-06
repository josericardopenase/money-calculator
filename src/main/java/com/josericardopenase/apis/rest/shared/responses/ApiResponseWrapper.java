package com.josericardopenase.apis.rest.shared.responses;

import lombok.Getter;

@Getter
public class ApiResponseWrapper<T> {

    public ApiResponseWrapper(int status, T result) {
        this.status = status;
        this.result = result;
    }

    private final int status;

    private final T result;

    public ApiResponseWrapper(T result) {
        this.result = result;
        this.status = 200;
    }

    public ApiResponseWrapper(T result, int status) {
        this.result = result;
        this.status = status;
    }


}