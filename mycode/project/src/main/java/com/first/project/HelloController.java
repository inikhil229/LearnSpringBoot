package com.first.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Helloworld(){
        return "<h1>Hello User</h1>";
    }

}
