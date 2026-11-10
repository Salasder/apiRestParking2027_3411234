package com.sena.apiparking.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class ApiExeception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final HttpStatus status;

	public ApiExeception(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}

	public static ApiExeception notFound(String msg) {
		return new ApiExeception(HttpStatus.NOT_FOUND, msg);
	}

	public static ApiExeception conflict(String msg) {
		return new ApiExeception(HttpStatus.CONFLICT, msg);
	}

	public static ApiExeception badrequest(String msg) {
		return new ApiExeception(HttpStatus.BAD_REQUEST, msg);
	}

}
