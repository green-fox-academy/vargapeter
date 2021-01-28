package com.example.guardian.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Yondu {

    Double distance;
    Double time;
    Double speed;

    public Yondu(Double distance, Double time) {

        this.distance = distance;
        this.time = time;
        this.speed = distance / time;

    }

}


