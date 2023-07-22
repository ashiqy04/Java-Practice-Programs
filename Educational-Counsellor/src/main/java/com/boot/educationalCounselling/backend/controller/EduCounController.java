package com.boot.educationalCounselling.backend.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.educationalCounselling.backend.entity.EducationalCounsellor;
import com.boot.educationalCounselling.backend.service.EduCounService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/institutes")
@Slf4j

public class EduCounController {

	Logger logger = LoggerFactory.getLogger(EduCounController.class);

	@Autowired
	private EduCounService eduCounService;

	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	@PostMapping("/add-institute")
	public String save(@Valid @RequestBody EducationalCounsellor educationalCounsellor) {
		logger.info("Adding a institute:" + educationalCounsellor);
		eduCounService.save(educationalCounsellor);
		return "Institute details added successfully";
	}

	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	@GetMapping("/institute/{id}")
	public EducationalCounsellor findById(@PathVariable("id") Long instituteId) {
		logger.info("Fetching institute of ID:" + instituteId);
		return eduCounService.findById(instituteId);

	}

	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/institutes-list")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public List<EducationalCounsellor> findAll() {
		logger.info("Fetching all institutes");
		return eduCounService.findAll();
	}

	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	@GetMapping("/institutes-locationMatch/{id}")
	public List<EducationalCounsellor> findByLoc(@PathVariable("id") Long id) {
		logger.info("Fetching all institutes with matching location preferred by student with id: " + id);
		return eduCounService.findbyloc(id);
	}

	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/institutes-locationAndCourseMatch/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public List<EducationalCounsellor> findByLocAndCourse(@PathVariable("id") Long id) {
		logger.info("Fetching all institutes with matching location preferred by student with id: " + id);
		return eduCounService.findByLocAndCourse(id);
	}

	// @Secured("ROLE_ADMIN")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/institutes-AllMatch/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public List<EducationalCounsellor> findByLocAndCourseAnd10(@PathVariable("id") Long id) {
		logger.info("Fetching all institutes with matching location preferred by student with id: " + id);
		return eduCounService.findUsingLocCourPercent1012Fee(id);
	}
}