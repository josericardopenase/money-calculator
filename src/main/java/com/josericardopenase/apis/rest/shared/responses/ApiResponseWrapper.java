package com.josericardopenase.apis.rest.shared.responses;
public class ApiResponseWrapper<T> {

    public ApiResponseWrapper(int status, T result) {
        this.status = status;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    private final int status;

    public T getResult() {
        return result;
    }

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