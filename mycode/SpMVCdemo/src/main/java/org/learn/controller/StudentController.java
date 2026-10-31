package org.learn.controller;

import org.learn.entity.Student;
import org.learn.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student ResStudent = studentService.createStudent(student);
        return ResponseEntity.ok(ResStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studnetRes = studentService.getStudent(id);
        if(studnetRes == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studnetRes);
    }

    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studnetResList = studentService.getAllStudent();

        return ResponseEntity.ok(studnetResList);
    }
}
