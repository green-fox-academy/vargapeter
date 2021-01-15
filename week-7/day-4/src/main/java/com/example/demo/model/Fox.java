package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fox {

    private FoxTricks tricks;
    private String food;
    private String drink;
    private String name;
    private List<String> listOvTricks = new ArrayList<>();
    private Integer numberOvTricks = listOvTricks.size();



}
