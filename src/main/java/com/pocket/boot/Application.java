package com.pocket.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication -> 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동 설정
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}