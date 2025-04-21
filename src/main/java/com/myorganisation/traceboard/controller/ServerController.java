package com.myorganisation.traceboard.controller;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping
    public ResponseEntity<String> serverHealth(){
        return new ResponseEntity<>("Server is Live", HttpStatusCode.valueOf(200));
    }
}
