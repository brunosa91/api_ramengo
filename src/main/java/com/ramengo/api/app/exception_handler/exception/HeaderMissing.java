package com.ramengo.api.app.exception_handler.exception;

public class HeaderMissing extends RuntimeException{
    public HeaderMissing(){
        super("x-api-key header missing");
    }
}
