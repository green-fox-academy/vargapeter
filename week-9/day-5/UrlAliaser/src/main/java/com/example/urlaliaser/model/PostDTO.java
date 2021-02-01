package com.example.urlaliaser.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    public String secretCode;

    @Override
    public String toString() {
        return "PostDTO{" +
                "secretCode='" + secretCode + '\'' +
                '}';
    }
}

