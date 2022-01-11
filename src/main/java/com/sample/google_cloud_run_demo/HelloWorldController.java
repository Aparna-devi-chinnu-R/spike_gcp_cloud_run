package com.sample.google_cloud_run_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldRepository helloWorldRepository;

    @Autowired
    public HelloWorldController(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @GetMapping("/home/{id}")
    public String returnHelloWorld(@PathVariable Long id){
        String name = helloWorldRepository.findId(id).getUserName();
        return "Hello " + name;
    }

    @GetMapping("/")
    public String returnHome(){
        return "Hello";
    }

    /*
       DATABASE_URL  "jdbc:postgresql://35.200.255.247:5432/postgres"
       DATABASE_USERNAME ayojak_user
       DATABASE_PASSWORD ayojak_user
     */

}
