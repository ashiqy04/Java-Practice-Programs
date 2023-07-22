package com.boot.educationalCounselling.backend.service;

import java.util.List;

import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;

public interface EduCounService {
	EducationalCounsellor save(EducationalCounsellor educationalCounsellorDto);

	List<EducationalCounsellor> findAll();

	EducationalCounsellor findById(Long instituteId);

	List<EducationalCounsellor> findbyloc(Long id);

	List<EducationalCounsellor> findByLocAndCourse(Long id);

	List<EducationalCounsellor> findUsingLocCourPercent1012Fee(Long id);
}
