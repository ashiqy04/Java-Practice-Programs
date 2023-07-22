package com.boot.educationalCounselling.backend.service;

import java.util.List;

import com.boot.educationalCounselling.backend.entity.Student;

public interface StudentService {

	void saveStudent(Student student);

	List<Student> displayStudents();

	Student displayStudentById(long id);

	Student updateStudentById(Student student, long id);

	void deleteStudentById(long id);
}
