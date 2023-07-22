package com.boot.educationalCounselling.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegisterDto {

	@NotEmpty(message = "Enter first name")
	@Size(max = 20, message = "size must not exceed 20 letters,")
	@Pattern(regexp = "^[A-Z][a-z]*$", message = "First Letter must be in captital.")
	private String firstName;

	@NotEmpty(message = "Enter last name")
	@Size(max = 20, message = "size must not exceed 20 letters,")
	@Pattern(regexp = "^[A-Z][a-z]*$", message = "First Letter must be in captital")
	private String lastName;

	@Email(message = "Invalid email format!Enter a valid email id")
	@NotEmpty(message = "Enter email id")
	private String email;

	@NotEmpty(message = "password field cannot be empty")
	@Size(min=5, max=15, message="password must have about 5 to 15 characters")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterDto(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public RegisterDto() {
	}
}
