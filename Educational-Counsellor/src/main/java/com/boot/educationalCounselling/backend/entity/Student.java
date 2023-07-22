package com.boot.educationalCounselling.backend.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Range;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Student")
public class Student {

	@Column(name = "Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "FirstName")
	@NotEmpty(message = "Field should not be empty")
	@Size(max = 20, message = "size must not exceed 20 letters,")
	@Pattern(regexp = "^[A-Z][a-z]*$", message = "First Letter must be in captital")
	private String firstName;

	@Column(name = "LastName")
	@NotEmpty(message = "Field should not be empty")
	@Size(max = 20, message = "size must not exceed 20 letters,")
	@Pattern(regexp = "^[A-Z][a-z]*$", message = "First letter must be in capital")
	private String lastName;

	@Column(name = "PhoneNo")
	@NotEmpty(message = "Field should not be empty")
	@Size(min = 10, max = 10, message = "Phone number must have 10 digits only")
	@Pattern(regexp = "^[6789][0-9]*$", message = "phone number must start with 6/7/8/9 ; No special characters/alphabets")
	private String phoneNo;

	@Column(name = "DateOfBirth")
	@NotNull(message = "Field should not be null")
	@Pattern(regexp = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[9][0-9][0-9]|2[0][0-1][0-9]|2[0][2][0-2]))$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:2000|2004|2008|2012|2016|2020|(?:1[9])?(?:0[048]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[9][0-9][0-9]|2[0][0-1][0-9]|2[0][2][0-2]))$", message = "INVALID DATE! Please check if entered date is correct."
			+ "Year of Birth must not be greater than 2023" + " Date format : dd/mm/yyyy, dd-mm-yyyy or dd.mm.yyyy")
	private String dateOfBirth;

	@Column(name = "Email")
	@Email(message = "Enter a valid email")
	@NotEmpty(message = "Field should not be empty")
	private String email;

	@Column(name = "CourseOfChoice")
	@NotEmpty(message = "Field should not be empty")
	@Size(max = 10, message = "size must not exceed 10 letters,")
	private String courseOfChoice;

	@Column(name = "PercentageIn10th")
	@NotNull(message = "Field should not be empty")
	// @DecimalMin("0.0")
	// @DecimalMax("100.0")
	// @Pattern(regexp = "^[0-9]*.[0-9]{1,2}+$", message = "Decimal number can have
	// ONE or TWO digits after decimal point.")
	@Range(min = 0, max = 100, message = "Score must be between the range 0.0 to 100.0")
	private Double percentageIn10th;

	@Column(name = "PercentageIn12th")
	@NotNull(message = "Field should not be empty")
	// @DecimalMin("0.0")
	// @DecimalMax("100.0")
	// @Pattern(regexp = "^[0-9]*.[0-9]{1,2}+$", message = "Decimal number can have
	// ONE or TWO digit
	@Range(min = 0, max = 100, message = "Score must be between the range 0.0 to 100.0")
	private Double percentageIn12th;

	@Column(name = "LocationPreferred")
	@NotEmpty(message = "Field should not be empty")
	@Size(max = 10, message = "size must not exceed 10 letters,")
	private String locationPreferred;

	@Column(name = "FeeCapability")
	@NotNull(message = "Field should not be null")
	@Range(min = 100000, max = 1000000, message = "fees must be between 1Lakh to 10Lakhs")
	private long feeCapability;

	public Student() {

	}

	public Student(String firstName, String lastName, String phoneNo, String dateOfBirth, String email,
			String courseOfChoice, Double percentageIn10th, Double percentageIn12th, String locationPreferred,
			long feeCapability) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.courseOfChoice = courseOfChoice;
		this.percentageIn10th = percentageIn10th;
		this.percentageIn12th = percentageIn12th;
		this.locationPreferred = locationPreferred;
		this.feeCapability = feeCapability;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseOfChoice() {
		return courseOfChoice;
	}

	public void setCourseOfChoice(String courseOfChoice) {
		this.courseOfChoice = courseOfChoice;
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

	public String getLocationPreferred() {
		return locationPreferred;
	}

	public void setLocationPreferred(String locationPreferred) {
		this.locationPreferred = locationPreferred;
	}

	public long getFeeCapability() {
		return feeCapability;
	}

	public void setFeeCapability(long feeCapability) {
		this.feeCapability = feeCapability;
	}
}
