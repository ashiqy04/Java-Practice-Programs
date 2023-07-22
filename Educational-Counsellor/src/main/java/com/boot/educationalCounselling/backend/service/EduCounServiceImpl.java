package com.boot.educationalCounselling.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.boot.educationalCounselling.backend.controller.EduCounController;
import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;
import com.boot.educationalCounselling.backend.entity.Student;
import com.boot.educationalCounselling.backend.exceptionHandling.ResourceNotFoundException;
import com.boot.educationalCounselling.backend.repository.EduCounRepository;
import com.boot.educationalCounselling.backend.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EduCounServiceImpl implements EduCounService {

	Logger logger = LoggerFactory.getLogger(EduCounController.class);

	@Autowired
	private EduCounRepository eduCounRepository;

	@Autowired
	private StudentRepository studentRepository;

	public EducationalCounsellor save(EducationalCounsellor educationalCounsellorDto) {
		logger.info("Inside save method of EducationalCounsellorController");

		return eduCounRepository.save(educationalCounsellorDto);
	}

	public List<EducationalCounsellor> findAll() {
		logger.info("Inside findAll method of EducationalCounsellorController");

		return eduCounRepository.findAll();
	}

	public EducationalCounsellor findById(Long instituteId) {
		return eduCounRepository.findById(instituteId)
				.orElseThrow(() -> new NoSuchElementException("NO INSTITUTE PRESENT WITH ID = " + instituteId));
	}

	public List<EducationalCounsellor> findbyloc(Long id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		String instituteLocation = student.getLocationPreferred();
		return eduCounRepository.findByInstituteLocation(instituteLocation);
	}

	public List<EducationalCounsellor> findByLocAndCourse(Long id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		String instituteLocation = student.getLocationPreferred();
		String course = student.getCourseOfChoice();
		return eduCounRepository.findByInstituteLocationAndCourse(instituteLocation, course);

	}

	public List<EducationalCounsellor> findUsingLocCourPercent1012Fee(Long id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		String instituteLocation = student.getLocationPreferred();
		String course = student.getCourseOfChoice();
		Double percentageIn10th = student.getPercentageIn10th();
		Double percentageIn12th = student.getPercentageIn12th();
		Long fee = student.getFeeCapability();
		return eduCounRepository.findByInstituteLocationAndCourseAndPercentageIn10thAndPercentageIn12thAndFee(
				instituteLocation, course, percentageIn10th, percentageIn12th, fee);
	}
}
