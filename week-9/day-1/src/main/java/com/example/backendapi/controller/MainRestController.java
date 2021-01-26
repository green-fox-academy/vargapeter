package com.example.backendapi.controller;

import com.example.backendapi.model.*;
import com.example.backendapi.model.Error;
import com.example.backendapi.service.AppendaService;
import com.example.backendapi.service.DoublingService;
import com.example.backendapi.service.DountilService;
import com.example.backendapi.service.GreeterService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    private DoublingService doublingService;
    private GreeterService greeterService;
    private AppendaService appendaService;
    private DountilService dountilService;

    @Autowired
    public MainRestController(DoublingService doublingService, GreeterService greeterService, AppendaService appendaService, DountilService dountilService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendaService = appendaService;
        this.dountilService = dountilService;
    }


    @GetMapping("/doubling")
    public ResponseEntity<?> Doubling(@RequestParam(required = false) Integer input) {
        try {
            return ResponseEntity.ok(doublingService.doubling(input));
        } catch (DoublingNotFoundException e) {
            return new ResponseEntity<>(new Error(), HttpStatus.OK);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> Greeter(@RequestParam(required = false) String name, String title) {
        try {
            return ResponseEntity.ok(greeterService.greeter(name, title));
        } catch (GreeterNotFoundException e) {
            if (title == null && name == null) {
                GreetingError greetingError = new GreetingError("Please provide a name and a title!");
                return new ResponseEntity<>(greetingError, HttpStatus.BAD_REQUEST);
            } else if (title == null) {
                GreetingError greetingError = new GreetingError("Please provide a title!");
                return new ResponseEntity<>(greetingError, HttpStatus.BAD_REQUEST);
            } else {
                GreetingError greetingError = new GreetingError("Please provide a name!");
                return new ResponseEntity<>(greetingError, HttpStatus.BAD_REQUEST);
            }
        }
    }

    @GetMapping("/appenda/{string}")
    public ResponseEntity<?> Appenda(@PathVariable String string) {
        try {
            return ResponseEntity.ok(appendaService.appenda(string));
        } catch (GreeterNotFoundException e) {
            GreetingError greetingError = new GreetingError();
            return new ResponseEntity<>(greetingError, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> Dountil(@PathVariable String action, @RequestBody Until until) {
        try {
            return ResponseEntity.ok(dountilService.dountil(action, until.getUntil()));
        } catch (GreeterNotFoundException e) {
            GreetingError greetingError = new GreetingError();
            return new ResponseEntity<>(greetingError, HttpStatus.NOT_FOUND);
        }

    }

}
