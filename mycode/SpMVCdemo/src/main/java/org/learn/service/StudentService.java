package org.learn.service;

import org.learn.entity.Student;
import org.learn.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student){
        return studentRepository.saveStudent(student);
    }

    public Student getStudent(Long id){
        return studentRepository.getStudent(id);
    }

    public List<Student> getAllStudent(){
        return studentRepository.getAllStudents();
    }
}
