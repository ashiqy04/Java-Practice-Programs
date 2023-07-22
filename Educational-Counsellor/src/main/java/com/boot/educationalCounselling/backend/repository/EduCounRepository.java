package com.boot.educationalCounselling.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;

@Repository
public interface EduCounRepository extends JpaRepository<EducationalCounsellor, Long> {

	public List<EducationalCounsellor> findByInstituteLocation(String instituteLocation);

	public List<EducationalCounsellor> findByInstituteLocationAndCourse(String instituteLocation, String course);

	public List<EducationalCounsellor> findByInstituteLocationAndCourseAndPercentageIn10thAndPercentageIn12thAndFee(
			String instituteLocation, String course, Double percentageIn10th, Double percentageIn12th, Long fee);
}
