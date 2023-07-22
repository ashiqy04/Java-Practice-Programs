package com.boot.educationalCounselling.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class EducationalCounsellor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private long instituteId;
	@NotBlank(message = "Name is mandatory")
	@Column(unique = true, name = "Name")
	private String instituteName;
	@Email(message = "Invalid email address")
	@Column(name = "Email")
	private String instituteEmail;
	@NotBlank(message = "Location is mandatory")
	@Column(name = "Location")
	private String instituteLocation;
	@Column(name = "Capacity")
	private Long capacity;
	@NotBlank(message = "Course is mandatory")
	@Column(name = "Course")
	private String course;
	@Column(name = "Fee")
	private long fee;
	// @Column(name = "10thPercentage")
	@Min(0)
	@Max(100)
	private Double percentageIn10th;
//	@Column(name = "12thPercentage")
	@Min(0)
	@Max(100)
	private Double percentageIn12th;

	public EducationalCounsellor() {
		super();
	}

	public EducationalCounsellor(long instituteId, String instituteName, String instituteEmail,
			String instituteLocation, Long capacity, String course, long fee, Double percentageIn10th,
			Double percentageIn12th) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteEmail = instituteEmail;
		this.instituteLocation = instituteLocation;
		this.capacity = capacity;
		this.course = course;
		this.fee = fee;
		this.percentageIn10th = percentageIn10th;
		this.percentageIn12th = percentageIn12th;
	}

	public long getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(long instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteEmail() {
		return instituteEmail;
	}

	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
	}

	public String getInstituteLocation() {
		return instituteLocation;
	}

	public void setInstituteLocation(String instituteLocation) {
		this.instituteLocation = instituteLocation;
	}

	public Long getCapacity() {
		return capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public long getFee() {
		return fee;
	}

	public void setFee(long fee) {
		this.fee = fee;
	}

	public Double getPercentageIn10th() {
		return percentageIn10th;
	}

	public void setPercentageIn10th(Double percentageIn10th) {
		this.percentageIn10th = percentageIn10th;
	}

	public Double getPercentageIn12th() {
		return percentageIn12th;
	}

	public void setPercentageIn12th(Double percentageIn12th) {
		this.percentageIn12th = percentageIn12th;
	}

}
