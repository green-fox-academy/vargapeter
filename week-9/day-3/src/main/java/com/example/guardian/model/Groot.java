package com.example.guardian.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Groot {


    private String received;
    private String translated;

    public Groot(String received) {
        this.received = received;
        this.translated = "I am Groot!";
    }
}
