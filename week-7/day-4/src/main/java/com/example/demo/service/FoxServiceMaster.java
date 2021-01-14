package com.example.demo.service;

import com.example.demo.model.Drink;
import com.example.demo.model.Food;
import com.example.demo.model.Fox;
import com.example.demo.model.FoxTricks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxServiceMaster implements FoxService {

    private List<Fox> foxList = new ArrayList<>();


    @Override
    public List<Fox> getFoxList() {
        return foxList;
    }

    @Override
    public void addFox(Fox fox) {
        foxList.add(fox);
    }

    @Override
    public List<String> getFoxTricks() {
        return Arrays.stream(FoxTricks.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getFoodList() {
        return Arrays.stream(Food.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getDrinkList() {
        return Arrays.stream(Drink.values())
                .map(Enum::toString)
                .collect(Collectors.toList());
    }

}
