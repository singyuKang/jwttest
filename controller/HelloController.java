package com.example.jwttest.controller;


import com.example.jwttest.service.UserService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Builder
public class HelloController {

    public final UserService userService;


    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return
                ResponseEntity.ok("hello");
    }
}
