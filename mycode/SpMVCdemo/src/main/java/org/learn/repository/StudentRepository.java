package org.learn.repository;

import org.learn.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {
    private Map<Long, Student> studentDb;


    public StudentRepository(){
        this.studentDb = new HashMap<>();
    }

    public Student saveStudent(Student student){
        studentDb.put(student.getId(),student);
        return student;
    }

    public Student getStudent(Long id){
        return studentDb.get(id);
    }

    public List<Student> getAllStudents(){
        return new ArrayList<>(studentDb.values());
    }

}
