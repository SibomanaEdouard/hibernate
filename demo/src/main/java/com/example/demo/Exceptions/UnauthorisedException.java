package com.example.demo.Exceptions;

public class UnauthorisedException extends RuntimeException {
    public UnauthorisedException(String msg){
        super(msg);    }
}
