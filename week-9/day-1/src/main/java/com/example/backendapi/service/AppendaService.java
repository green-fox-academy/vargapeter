package com.example.backendapi.service;

import com.example.backendapi.model.Appenda;
import com.example.backendapi.model.Doubling;
import com.example.backendapi.model.DoublingNotFoundException;
import com.example.backendapi.model.GreeterNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppendaService {

    public Appenda appenda(String string) throws GreeterNotFoundException {
        if (string == null){
            throw new GreeterNotFoundException("");
        }
        else return new Appenda(string);
    }


}
