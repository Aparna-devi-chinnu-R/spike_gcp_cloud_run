package com.sample.google_cloud_run_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add/{name}")
    public String addName(@PathVariable String name){
        Long maxId = helloWorldRepository.getMaxId();
        System.out.println(maxId);
        Users user = new Users(maxId + 1, name);
        helloWorldRepository.save(user);
        return "entry " +name+ " registered" ;
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
