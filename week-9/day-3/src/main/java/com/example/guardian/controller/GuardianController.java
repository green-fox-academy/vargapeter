package com.example.guardian.controller;

import com.example.guardian.model.GrootErrorDTO;
import com.example.guardian.model.SomemessageNotFoundException;
import com.example.guardian.service.GrootService;
import com.example.guardian.service.YonduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    private GrootService grootService;
    private YonduService yonduService;

    @Autowired
    public GuardianController(GrootService grootService, YonduService yonduService) {
        this.grootService = grootService;
        this.yonduService = yonduService;
    }

    @GetMapping("/groot")
    public ResponseEntity<?> Groot(@RequestParam(required = false) String received) {
        try {
            return ResponseEntity.ok(grootService.groot(received));
        } catch (SomemessageNotFoundException exception) {
            if (received == null) {
                return new ResponseEntity<>(new GrootErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>(new GrootErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            }
        }
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> Yondu(@RequestParam(required = false) Double distance, Double time) {
        try {
            return ResponseEntity.ok(yonduService.yondu(distance, time));
        } catch (SomemessageNotFoundException exception) {
            if (distance == null && time == null) {
                return new ResponseEntity<>(new GrootErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            } else if (distance == null) {
                return new ResponseEntity<>(new GrootErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>(new GrootErrorDTO(exception.getMessage()), HttpStatus.BAD_REQUEST);
            }
        }
    }

    @GetMapping("/rocket")
    public ResponseEntity<?> Cargo(@RequestParam(required = false) Integer caliber) {
        return ResponseEntity.ok(yonduService.yondu());

    }
}







