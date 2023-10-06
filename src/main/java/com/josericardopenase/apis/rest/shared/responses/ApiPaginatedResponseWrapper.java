package com.josericardopenase.apis.rest.shared.responses;

import lombok.Getter;

@Getter
public class ApiPaginatedResponseWrapper<T> extends ApiResponseWrapper<T>{

    private final int page;
    private final int pageSize;
    public ApiPaginatedResponseWrapper(T result) {
        super(result);
        this.page = 0;
        this.pageSize = 20;
    }

    public ApiPaginatedResponseWrapper(int status, T result, int page,  int pageSize) {
        super(status, result);
        this.page = page;
        this.pageSize = pageSize;
    }


    public ApiPaginatedResponseWrapper(T result, int status, int page, int pageSize) {
        super(result, status);
        this.page = page;
        this.pageSize = pageSize;
    }

}
