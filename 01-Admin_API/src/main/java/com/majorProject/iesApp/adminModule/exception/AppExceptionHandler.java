package com.majorProject.iesApp.adminModule.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<AppException>handleException(String msg){
		AppException exc=new AppException();
		exc.setExCode("EX003");
		exc.setExDec(msg);
		exc.setExDate(LocalDate.now());
		
		return new ResponseEntity<AppException>(exc, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
