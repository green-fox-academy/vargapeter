package com.example.demo.service;

import com.example.demo.model.Fox;

import java.util.List;

public interface FoxService {
    void addFox(Fox fox);
    List<Fox> getFoxList();
    List<String> getFoxTricks();


}
