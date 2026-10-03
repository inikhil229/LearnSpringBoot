package com.learn.crud;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class StudentService {
    private String name;
    private  int rollNo;
    private String email;

}
