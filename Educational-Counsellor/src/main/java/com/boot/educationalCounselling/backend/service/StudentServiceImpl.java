package com.boot.educationalCounselling.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.educationalCounselling.backend.entity.Student;
import com.boot.educationalCounselling.backend.exceptionHandling.ResourceNotFoundException;
import com.boot.educationalCounselling.backend.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	// constructor injection
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> displayStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student displayStudentById(long id) {
		return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));

	}

	@Override
	public Student updateStudentById(Student student, long id) {
		Student existingStudent = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setPhoneNo(student.getPhoneNo());
		existingStudent.setDateOfBirth(student.getDateOfBirth());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setCourseOfChoice(student.getCourseOfChoice());
		existingStudent.setPercentageIn10th(student.getPercentageIn10th());
		existingStudent.setPercentageIn12th(student.getPercentageIn12th());
		existingStudent.setLocationPreferred(student.getLocationPreferred());
		existingStudent.setFeeCapability(student.getFeeCapability());
		return studentRepository.save(existingStudent);
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		studentRepository.deleteById(id);
	}
}
