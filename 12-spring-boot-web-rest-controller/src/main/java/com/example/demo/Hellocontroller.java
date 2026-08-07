package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    // --> /hello
    //--> /order
    @GetMapping("hello")
    public  String hello(){
        return  "<h1>Hello World</>";
    }

    @GetMapping("bye")
    public  String Greedbye(){
        return  "<h1>Bye World</>";
    }
}
