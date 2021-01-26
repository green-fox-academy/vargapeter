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
            throw new GreeterNotFoundException("Please provide a name and a title!");
        }
        if (name == null){
            throw new GreeterNotFoundException("Please provide a name!");
        }
        if (title == null){
            throw new GreeterNotFoundException("Please provide a title!");
        }
        else return new Greeter(name, title);
    }
}
