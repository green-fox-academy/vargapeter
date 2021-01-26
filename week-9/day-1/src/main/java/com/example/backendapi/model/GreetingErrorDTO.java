package com.example.backendapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GreetingErrorDTO {
    private String error;

    public GreetingErrorDTO(String error) {
        this.error = error;
    }
}

