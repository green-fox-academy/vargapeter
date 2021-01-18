package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.hibernate.cache.spi.entry.StructuredCacheEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController implements CommandLineRunner{

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository ) {this.todoRepository = todoRepository;}


    @GetMapping(value = {"/","/list"})
    public String list(Model model){
        model.addAttribute("todoList",todoRepository.findAll());
        return "todo";
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("feladat"));
    }

}
