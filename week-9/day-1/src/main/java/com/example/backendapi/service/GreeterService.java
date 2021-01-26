package com.example.backendapi.service;

import com.example.backendapi.model.Doubling;
import com.example.backendapi.model.DoublingNotFoundException;
import com.example.backendapi.model.Greeter;
import com.example.backendapi.model.GreeterNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {

    public Greeter greeter(String name, String title) throws GreeterNotFoundException {
        if (name == null && title==null){
            throw new GreeterNotFoundException();
        }
        if (name == null){
            throw new GreeterNotFoundException();
        }
        if (title == null){
            throw new GreeterNotFoundException();
        }
        else return new Greeter(name, title);
    }
}
