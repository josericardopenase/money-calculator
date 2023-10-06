package com.josericardopenase.apis.rest.shared.responses;

public class ApiPaginatedResponseWrapper<T> extends ApiResponseWrapper<T>{

    private final int page;
    private final int page_size;
    public ApiPaginatedResponseWrapper(T result) {
        super(result);
        this.page = 0;
        this.page_size = 20;
    }

    public ApiPaginatedResponseWrapper(int status, T result, int page_size, int page, int page1, int pageSize) {
        super(status, result);
        this.page = page1;
        this.page_size = pageSize;
    }


    public ApiPaginatedResponseWrapper(T result, int status, int page, int pageSize) {
        super(result, status);
        this.page = page;
        page_size = pageSize;
    }

    public int getPage() {
        return page;
    }

    public int getPage_size() {
        return page_size;
    }
}
