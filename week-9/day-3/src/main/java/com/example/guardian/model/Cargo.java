package com.example.guardian.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Cargo {

    Integer caliber25;
    Integer caliber30;
    Integer caliber50;
    String shipstatus;
    boolean ready;

    public Cargo(Integer caliber){
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipstatus = "empty";
        boolean ready = false;

    }

}
