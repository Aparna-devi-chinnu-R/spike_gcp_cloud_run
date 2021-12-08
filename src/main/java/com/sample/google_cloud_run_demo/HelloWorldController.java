package com.sample.google_cloud_run_demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") //TODO : Revisit  for proper url
public class HelloWorldController {

    @GetMapping("/home")
    public String returnHelloWorld(){
        return "Hello world";
    }

}
