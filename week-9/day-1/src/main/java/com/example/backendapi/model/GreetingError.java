package com.example.backendapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GreetingError {
    private String error;

    public GreetingError(String error) {
        this.error = error;
    }
}

