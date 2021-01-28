package com.example.guardian.service;

import com.example.guardian.model.Groot;
import com.example.guardian.model.SomemessageNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GrootService {

    public Groot groot(String message) throws SomemessageNotFoundException {
        if (message==null) {
            throw new SomemessageNotFoundException("I am Groot!");
        }
        else return new Groot(message);
    }
}
