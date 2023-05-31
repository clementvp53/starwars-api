package com.starwars.exceptions;

import org.springframework.http.HttpStatus;

public class UnExpectedHttpException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5658452453463122840L;

	public UnExpectedHttpException(HttpStatus status) {
		super(status.toString());
	}

}
