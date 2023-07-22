package com.boot.educationalCounselling.backend.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;
import com.boot.educationalCounselling.backend.entity.Student;
import com.boot.educationalCounselling.backend.service.EduCounService;
import com.boot.educationalCounselling.backend.service.StudentService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@Autowired
	private EduCounService eduCounService;

	@PostMapping("/add")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public List<EducationalCounsellor> saveStudent(@Valid @RequestBody Student student) {
		logger.info("Adding Student Details to the STUDENT database.Id is: " + student.getId());
		studentService.saveStudent(student);
//		return "Student Data Saved Successfully."
//				+ "\nYour Student id is "+ student.getId() 
//				+"\nPlease use your Id number to view the suggested list of institutes"	;
		long id = student.getId();
		logger.info("LISTING INSTITUTES BASED ON GIVEN PREFERENCES");
		return eduCounService.findUsingLocCourPercent1012Fee(id);
	}

	// @Secured("ROLE_ADMIN")
	@GetMapping("/display")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Student> displayStudents() {
		logger.info("Displaying All Student's Details. ");
		return studentService.displayStudents();

	}

	@GetMapping("display/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Student displayById(@PathVariable("id") long id) {
		logger.info("Displaying All Student Details of Student with Id: " + id);
		return studentService.displayStudentById(id);

	}

	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	@PutMapping("/update/{id}")
	public String updateStudentById(@Valid @RequestBody Student student, @PathVariable("id") long id) {
		logger.info("Updating Student Details of Student with Id: " + id);
	    studentService.updateStudentById(student, id);
	    return "STUDENT DETAILS UPDATED SUCCESSFULLY";
	}

	@Secured("ROLE_ADMIN")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@DeleteMapping("delete/{id}")
	public String deleteStudentById(@PathVariable("id") long id) {
		logger.info("Deleting Student Details of Student with Id: " + id);
		studentService.deleteStudentById(id);
		return "Deleted Student Successfully";
	}
}
