package com.example.backendapi.service;

import com.example.backendapi.model.DoublingNotFoundException;
import com.example.backendapi.model.Dountil;
import com.example.backendapi.model.DountilException;
import com.example.backendapi.model.GreeterNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DountilService {

    public Dountil dountil(String action, Integer until) throws DountilException {
        Dountil dountil = new Dountil();
        if (until == null){
            throw new DountilException();
        }
        if (action.equals("sum")) {
            for (int i = 1; i <= until; i++) {
                dountil.setResult(dountil.getResult() + i);
            }
        }
        if (action.equals("factor")) {
            dountil.setResult(1);
            for (int i = 1; i <= until; i++) {
                dountil.setResult(dountil.getResult() * i);
            }
        }
        return dountil;

    }
}
