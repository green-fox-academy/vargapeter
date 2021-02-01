package com.example.urlaliaser.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Random;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    private String secretCode = secretCode();
    @Column(unique = true)
    private String alias;
    @Type(type = "text")
    private String url;
    @Column(nullable = false)
    private Long hitCount;

    public String secretCode() {
        Random r = new Random();
        String randomNumber = String.format("%04d", (Object) Integer.valueOf(r.nextInt(10000)));
        return randomNumber;
    }

}

