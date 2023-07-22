package com.boot.educationalCounselling.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.educationalCounselling.backend.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}