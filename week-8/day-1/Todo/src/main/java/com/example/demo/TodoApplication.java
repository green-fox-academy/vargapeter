package com.example.demo;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

    private TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository ) {this.todoRepository = todoRepository;}

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }



}
