package com.example.backendapi.model;

public class GreeterNotFoundException extends Exception{
    public GreeterNotFoundException (String message) {
        super(message);
    }
}
