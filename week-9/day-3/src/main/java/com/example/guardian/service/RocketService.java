package com.example.guardian.service;

import com.example.guardian.model.Cargo;
import com.example.guardian.model.Groot;
import com.example.guardian.model.SomemessageNotFoundException;

public class RocketService {

    public Cargo cargo(String message) throws SomemessageNotFoundException {
        if (message==null) {
            throw new SomemessageNotFoundException("I am Groot!");
        }
        else return new Cargo(message);
    }


    }

