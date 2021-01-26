package com.example.backendapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Error {

    private String error;

    public Error() {
        this.error = "Please provide an input!";
    }
}
