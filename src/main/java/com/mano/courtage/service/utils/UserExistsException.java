package com.mano.courtage.service.utils;

@SuppressWarnings("serial")
public class UserExistsException extends RuntimeException {
	private String email;

	public UserExistsException(String email) {
	    this.email = email;
	}
	public UserExistsException() {
	}

	public String getEmail() {
		return email;
	}
}
