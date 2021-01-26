package com.example.backendapi.service;

import com.example.backendapi.model.Doubling;
import com.example.backendapi.model.DoublingNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoublingService {


    public Doubling doubling(Integer input) throws DoublingNotFoundException {
        if (input == null){
            throw new DoublingNotFoundException();
        }
        else return new Doubling(input);
    }


}
