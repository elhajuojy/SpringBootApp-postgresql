package com.elhjuojycode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/")
    public  GreetResponse greet(){
        return new  GreetResponse("Hello greet",
                List.of("java","dart","c#","js"),
                new Person("mehdi",23,488.2)
        );
    }


    record Person(String name,int age , double saving){}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLang,
            Person  person
    ){}
}
