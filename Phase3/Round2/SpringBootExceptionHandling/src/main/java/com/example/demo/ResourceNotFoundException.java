package com.example.demo;

//specific exception
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException(String s) {
		super(s);
	}
}
