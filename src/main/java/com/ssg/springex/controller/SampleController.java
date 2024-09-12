package com.ssg.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public void hell(){
        log.info("hello~~ spring web MVC~~ 조아쒀! 영촤!");
    }
    @GetMapping("/ex1")
    public void ex1(String name, int age){
        log.info("ex1...");
        log.info("ex1에서 처리한 이름과 나이{}{}", name, age);
    }
    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name, @RequestParam(name = "age", defaultValue = "20") int age){
        log.info("ex2...");
        log.info("ex2에서 처리한 이름과 나이{}{}", name, age);
    }
    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate){
        log.info("ex3...");
        log.info("ex3에서 처리한 dueDate{}", dueDate);
    }
    //04:16:09  WARN [org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver] Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Failed to convert value of type 'java.lang.String' to required type 'java.time.LocalDate'; nested exception is org.springframework.core.convert.ConversionFailedException: Failed to convert from type [java.lang.String] to type [java.time.LocalDate] for value [2024-09-10]; nested exception is java.lang.IllegalArgumentException: Parse attempt failed for value [2024-09-10]]
    //이러한 문제가 생긴디~~
}
