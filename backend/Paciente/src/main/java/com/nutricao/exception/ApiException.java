package com.nutricao.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException{

    private static final long serialVersionUID = -6017698758226023738L;
    public final HttpStatus status;
    public final String error;

    public ApiException(HttpStatus status, String error) {
        this.status = status;
        this.error = error;
    }

    public ApiException(String message, HttpStatus status, String error) {
        super(message);
        this.status = status;
        this.error = error;
    }

    public ApiException(String message, Throwable cause, HttpStatus status, String error) {
        super(message, cause);
        this.status = status;
        this.error = error;
    }

    public ApiException(Throwable cause, HttpStatus status, String error) {
        super(cause);
        this.status = status;
        this.error = error;
    }

    public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus status, String error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
        this.error = error;
    }
}