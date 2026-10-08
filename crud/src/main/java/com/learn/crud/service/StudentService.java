package com.learn.crud.service;

import com.learn.crud.entity.Student;
import com.learn.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository ){
        this.studentRepository = studentRepository;
    }

    public Student create(Student student){
        Student studentResponse = studentRepository.save(student);
        return studentResponse;
    }

    public Student getStudent(Long id){
        Optional<Student> student = studentRepository.findById(id);

        return student.isPresent() ? student.get() : null;
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public Student updateStudent(Student student){
        Optional<Student> s = studentRepository.findById(student.getId());

        if(s.isEmpty()){
            return null;
        }

        Student studentToSave = s.get();
        studentToSave.setName(student.getName());
        studentToSave.setEmail(student.getEmail());
        studentToSave.setAge(student.getAge());
        studentToSave.setRollNo(student.getRollNo());
        studentToSave.setSubject(student.getSubject());

        studentRepository.save(studentToSave);

        return studentToSave;

    }

    public Boolean dStudent(Long id){
        Boolean student = studentRepository.existsById(id);
        if(!student){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

}
