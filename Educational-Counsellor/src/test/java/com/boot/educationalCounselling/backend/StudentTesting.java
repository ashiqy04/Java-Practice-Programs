package com.boot.educationalCounselling.backend;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.boot.educationalCounselling.backend.entity.Student;
import com.boot.educationalCounselling.backend.repository.StudentRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentTesting {

	@Autowired
	private StudentRepository repository;


	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveStudentTest() {
		Student student = new Student();
		student.setId((long) 1);
		student.setFirstName("Ashiq");
		student.setLastName("Y");
		student.setLocationPreferred("Coimbatore");
		student.setEmail("ash@gmail.com");
		student.setPhoneNo("8987647231");
		student.setCourseOfChoice("AI");
		student.setDateOfBirth("12/12/1997");
		student.setFeeCapability(450000);
		student.setPercentageIn10th(90.0);
		student.setPercentageIn12th(89.0);

		

		repository.save(student);
		Assertions.assertThat(student.getId()).isGreaterThan(0);
		Assertions.assertThat(student.getFirstName()).isNotEmpty().isNotBlank();
		Assertions.assertThat(student.getLastName()).isNotEmpty();
		Assertions.assertThat(student.getEmail()).isNotEmpty();
		Assertions.assertThat(student.getLocationPreferred()).isNotEmpty();
		Assertions.assertThat(student.getPhoneNo()).isNotEmpty();
		Assertions.assertThat(student.getCourseOfChoice()).isNotEmpty();
		Assertions.assertThat(student.getDateOfBirth()).isNotNull();
		Assertions.assertThat(student.getFeeCapability()).isNotNull();
		Assertions.assertThat(student.getPercentageIn10th()).isNotNull().isGreaterThan(0).isLessThanOrEqualTo(100);
		Assertions.assertThat(student.getPercentageIn12th()).isNotNull().isGreaterThan(0).isLessThanOrEqualTo(100);
	}

	@Test
	@Order(2)
	@Rollback(value = false)
	public void getAllIStudent() {
		List<Student> student = repository.findAll();
		Assertions.assertThat(student.size()).isGreaterThan(0);
	}

	@Test
	@Order(3)
	@Rollback(value = false)
	public void getInstituteByIdTest() {
		Student student = repository.findById((long) 1).get();
		Assertions.assertThat(student.getId()).isEqualTo(1);
	}

}

