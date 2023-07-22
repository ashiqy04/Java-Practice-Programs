package com.boot.educationalCounselling.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.educationalCounselling.backend.dto.LoginDto;
import com.boot.educationalCounselling.backend.dto.RegisterDto;
import com.boot.educationalCounselling.backend.dto.ResetPasswordDto;
import com.boot.educationalCounselling.backend.service.AuthService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/auth")
@Slf4j
public class AuthController {

	Logger logger = LoggerFactory.getLogger(AuthController.class);
	private AuthService authService;

	@Autowired
	private AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping(value = { "/login", "/signIn" })
	public ResponseEntity<String> login(@Valid @RequestBody LoginDto loginDto) {
		logger.info("LOGGING IN WITH REGISTERED CREDENTIALS.......");
		String response = authService.login(loginDto);
		return ResponseEntity.ok(response);
	}

	@PostMapping(value = { "/register", "/signUp" })
	public ResponseEntity<String> register(@Valid @RequestBody RegisterDto registerDto) {
		logger.info("REGISTERING USER....");
		String response = authService.register(registerDto);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@PostMapping("/resetPassword")
	public ResponseEntity<String> resetPassword(@Valid  @RequestBody ResetPasswordDto resetPasswordDto) {
		String response = authService.resetPassword(resetPasswordDto);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
