package com.example.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//handle a specific exception                          getbyid/10
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,WebRequest request){
		ErrorDetail detail=new ErrorDetail(new Date(), exception.getMessage(), request.getDescription(false));
	return new ResponseEntity(detail,HttpStatus.NOT_FOUND);
	
	}

	
	
	//handle global exception
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception,WebRequest request){
		ErrorDetail detail=new ErrorDetail(new Date(), exception.getMessage(), request.getDescription(false));
	return new ResponseEntity(detail,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	
}


