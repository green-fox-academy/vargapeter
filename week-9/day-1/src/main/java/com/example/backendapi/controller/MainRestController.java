package com.example.backendapi.controller;

import com.example.backendapi.model.*;
import com.example.backendapi.model.Error;
import com.example.backendapi.service.AppendaService;
import com.example.backendapi.service.DoublingService;
import com.example.backendapi.service.DountilService;
import com.example.backendapi.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
        } catch (GreeterNotFoundException exception) {
            if (title == null && name == null) {
                return new ResponseEntity<>(new GreetingErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            } else if (title == null) {
                return new ResponseEntity<>(new GreetingErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>(new GreetingErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            }
        }
    }

    @GetMapping("/appenda/{string}")
    public ResponseEntity<?> Appenda(@PathVariable String string) {
        try {
            return ResponseEntity.ok(appendaService.appenda(string));
        } catch (GreeterNotFoundException e) {
            GreetingErrorDTO greetingErrorDTO = new GreetingErrorDTO();
            return new ResponseEntity<>(greetingErrorDTO, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> Dountil(@PathVariable String action, @RequestBody Until until) {
        try {
            return ResponseEntity.ok(dountilService.dountil(action, until.getUntil()));
        } catch (DountilException exception) {
            GreetingErrorDTO greetingErrorDTO = new GreetingErrorDTO();
            return new ResponseEntity<>(greetingErrorDTO, HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody Array array){
        if (array.getWhat().isEmpty()){
            ArrayError arrayError = new ArrayError("Please provide what to do with the numbers!");
            return ResponseEntity.ok(arrayError);
        } else if (array.getWhat().equals("sum")) {
            int result = array.getNumbers().stream().mapToInt(n -> n).sum();
            return ResponseEntity.ok(result);
        } else if (array.getWhat().equals("multiply")) {
            int result = array.getNumbers().stream().reduce(1,(a,b)->a*b);
            return ResponseEntity.ok(result);
        } else if (array.getWhat().equals("double")) {
            List<Integer> result = array.getNumbers().stream().map(n -> n * 2).collect(Collectors.toList());
            return ResponseEntity.ok(result);
        }
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
