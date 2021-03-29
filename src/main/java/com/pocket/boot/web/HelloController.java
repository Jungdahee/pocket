package com.pocket.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 컨트롤러로 만들어주는 annotation
public class HelloController {

    @GetMapping("/hello") // http 메소드인 GET 요청을 받는 API
    public String hello(){
        return "hello";
    }
}
