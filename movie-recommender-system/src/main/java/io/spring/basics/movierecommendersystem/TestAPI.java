package io.spring.basics.movierecommendersystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("/")
    public String greetUser(){
        return "Hello User";
    }
    @GetMapping("/{name}")
    public String displayName(@PathVariable String name){
        return "Hello : "+name;
    }
}
