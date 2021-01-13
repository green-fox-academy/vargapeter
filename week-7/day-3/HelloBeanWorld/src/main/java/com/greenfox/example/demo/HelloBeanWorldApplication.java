package com.greenfox.example.demo;

import com.greenfox.example.demo.service.BlueColor;
import com.greenfox.example.demo.service.MyColor;
import com.greenfox.example.demo.service.Printer;
import com.greenfox.example.demo.service.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorldApplication.class, args);
    }

    @Autowired //2
    HelloBeanWorldApplication(MyColor myColor, Printer printer){
        this.printer = printer;
        this.myColor = myColor;
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(myColor.printColor()); //1

    }
//    @Autowired //1
//    HelloBeanWorldApplication(Printer printer) {
//        this.printer = printer;

//    }

}
