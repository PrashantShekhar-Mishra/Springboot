package com.myapp.crud.exception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String message){
		super(message);
	}
}
