package com.example.guardian.service;

import com.example.guardian.model.Groot;
import com.example.guardian.model.SomemessageNotFoundException;
import com.example.guardian.model.Yondu;
import org.springframework.stereotype.Service;

@Service
public class YonduService {

    public Yondu yondu(Double distance, Double time) throws SomemessageNotFoundException {
        if (distance == null && time==null){
            throw new SomemessageNotFoundException("Please provide a distance and a time!");
        }
        if (distance == null){
            throw new SomemessageNotFoundException("Please provide a distance!");
        }
        if (time == null){
            throw new SomemessageNotFoundException("Please provide a time!");
        }
        else return new Yondu(distance, time);
    }
}

