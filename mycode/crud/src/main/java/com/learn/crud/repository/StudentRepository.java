package com.learn.crud.repository;

import com.learn.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student,Long> {

    public Optional<Student> findByIdAndDeletedIsFalse(Long id);

    public List<Student> findByDeletedIsFalse();
}
