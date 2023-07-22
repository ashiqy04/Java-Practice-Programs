package com.boot.educationalCounselling.backend.exceptionHandling;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
		ErrorDetails ed = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(ed, HttpStatus.NOT_FOUND);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String, String> errorMap = new HashMap<>();

		ex.getBindingResult().getFieldErrors().forEach((error) -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});

		return errorMap;
	}

	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<?> handleAccessDeniedException(AccessDeniedException exception, WebRequest request) {
		ErrorDetails ed = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false),
				HttpStatus.FORBIDDEN);
		return new ResponseEntity<Object>(ed, HttpStatus.FORBIDDEN);
	}

	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(BadCredentialsException.class)
	public ResponseEntity<?> handleAuthenticationException(Exception exception, WebRequest request) {
		ErrorDetails ed = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false),
				HttpStatus.UNAUTHORIZED);
		return new ResponseEntity<Object>(ed, HttpStatus.UNAUTHORIZED);
	}
	
	
}
