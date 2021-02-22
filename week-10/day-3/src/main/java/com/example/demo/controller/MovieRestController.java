//package com.example.demo.controller;
//
//import com.example.demo.model.GenreListDTO;
//import com.example.demo.service.ServiceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//
//@RestController
//public class MovieRestController {
//
//    @Autowired
//    private ServiceService serviceService;
//
//    @GetMapping("/genres")
//    public ResponseEntity<GenreListDTO> getAllGenres() throws IOException {
//        return ResponseEntity.ok(serviceService.getGenreList());
//    }
//
//}
