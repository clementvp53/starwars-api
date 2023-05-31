package com.starwars.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.starwars.AppConstants;
import com.starwars.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class StarWarsControllerAdvice extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException exception) {
		return new ResponseEntity<String>(AppConstants.INVALID_RESOURCE_ID, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HttpClientErrorException.NotFound.class)
	public ResponseEntity<String> handleHttpClientErrorException(HttpClientErrorException exception) {
		return new ResponseEntity<String>(AppConstants.INVALID_RESOURCE_ID, HttpStatus.BAD_REQUEST);
	}
	
	

}
