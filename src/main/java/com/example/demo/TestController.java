package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    @PostMapping("/test")
    public ResponseEntity enumTest(@RequestBody Request request ){
        log.info(request.toString());
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
