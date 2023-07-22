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

import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;
import com.boot.educationalCounselling.backend.repository.EduCounRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InstituteTesting {

	@Autowired
	private EduCounRepository repository;


	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveInstituteTest() {
		EducationalCounsellor institute = new EducationalCounsellor();
		institute.setInstituteId((long) 1);
		institute.setInstituteName("sns institute");
		institute.setInstituteEmail("sns@gmail.com");
		institute.setInstituteLocation("Coimbatore");
		institute.setCapacity((long) 100);
		institute.setCourse("AI");
		institute.setFee(54000);
		institute.setPercentageIn10th(89.9);
		institute.setPercentageIn12th(89.7);
		// institute-2
		institute.setInstituteId((long) 2);
		institute.setInstituteName("mgr institute");
		institute.setInstituteEmail("mgr@gmail.com");
		institute.setInstituteLocation("Chennai");
		institute.setCapacity((long) 100);
		institute.setCourse("CSE");
		institute.setFee(530000);
		institute.setPercentageIn10th(56.9);
		institute.setPercentageIn12th(70.0);

		repository.save(institute);
		Assertions.assertThat(institute.getInstituteId()).isGreaterThan(1);
		Assertions.assertThat(institute.getInstituteName()).isNotNull().isNotBlank();
		Assertions.assertThat(institute.getInstituteEmail()).isNotBlank();
		Assertions.assertThat(institute.getInstituteLocation()).isNotBlank();
		Assertions.assertThat(institute.getCapacity()).isNotNull();
		Assertions.assertThat(institute.getCourse()).isNotBlank();
		Assertions.assertThat(institute.getPercentageIn10th()).isGreaterThan(0).isLessThanOrEqualTo(100);
		Assertions.assertThat(institute.getPercentageIn12th()).isGreaterThan(0).isLessThanOrEqualTo(100);
	}

	@Test
	@Order(2)
	@Rollback(value = false)
	public void getAllInstitute() {
		List<EducationalCounsellor> institute = repository.findAll();
		Assertions.assertThat(institute.size()).isGreaterThan(0);
	}

	@Test
	@Order(3)
	@Rollback(value = false)
	public void getInstituteByIdTest() {
		EducationalCounsellor institute = repository.findById((long) 1).get();
		Assertions.assertThat(institute.getInstituteId()).isEqualTo(1);
	}

}