package com.greenfox.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        return"It is blue in color...";

    }

}


