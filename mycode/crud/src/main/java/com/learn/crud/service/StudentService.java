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

        student.setDeleted(false);
        Student studentResponse = studentRepository.save(student);
        return studentResponse;
    }

    public Student getStudent(Long id){
        Optional<Student> student = studentRepository.findByIdAndDeletedIsFalse(id);

        if(student.isPresent()){
            return  student.get();
        } else if (student.get().getDeleted() == false) {
            return null;
        }
        else{
            return null;
        }
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findByDeletedIsFalse();
        return students;
    }

    public Student updateStudent(Student student){
        Optional<Student> s = studentRepository.findByIdAndDeletedIsFalse(student.getId());

        if(s.isEmpty()){
            return null;
        }

        Student studentToSave = s.get();
        studentToSave.setName(student.getName());
        studentToSave.setEmail(student.getEmail());
        studentToSave.setAge(student.getAge());
        studentToSave.setRollNo(student.getRollNo());
        studentToSave.setSubject(student.getSubject());

        studentToSave.setDeleted(false);

        return studentRepository.save(studentToSave);

    }

    public Boolean dStudent(Long id){
        Boolean student = studentRepository.existsById(id);
        if(!student){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

    public Boolean deleteSoftly(Long id){
        studentRepository.findByIdAndDeletedIsFalse(id);

        return  false;
    }

}
