package com.example.backendapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {

    private Integer received;
    private Integer result;

    public Doubling(Integer recived) {
        this.received = recived;
        this.result = recived*2;

    }
}
