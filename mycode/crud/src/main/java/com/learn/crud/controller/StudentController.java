package com.learn.crud.controller;

import com.learn.crud.entity.Student;
import com.learn.crud.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = service.create(student);
//        return "Student created successfully";
        return ResponseEntity.status(201).body(createdStudent);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = service.getStudent(id);
        if(student == null){
            return ResponseEntity.notFound().build();
        }


        return ResponseEntity.ok(student);
    }

    @GetMapping("all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = service.getAllStudents();

        if(students.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }

    @PutMapping("")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student s = service.updateStudent(student);
        if(s == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(s);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Boolean student = service.dStudent(id);

        if(!student){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Student Deleted Successfully");
    }

    @PatchMapping("soft/{id}")
    public ResponseEntity<String> softDelete(@PathVariable Long id){
        Boolean isDeleted = service.deleteSoftly(id);

        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Student deleted successfully");
    }

}
