package com.ramengo.api.app.exception_handler.exception;

public class ServerError extends RuntimeException{
    public ServerError(){
        super("could not place order");
    }
}
