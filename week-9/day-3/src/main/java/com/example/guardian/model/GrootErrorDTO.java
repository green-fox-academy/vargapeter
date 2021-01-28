package com.example.guardian.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GrootErrorDTO {

    private String error;

    public GrootErrorDTO(String error) {
        this.error = error;
    }
}
