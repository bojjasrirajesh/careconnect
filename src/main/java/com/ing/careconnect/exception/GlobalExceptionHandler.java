package com.ing.careconnect.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ing.careconnect.dto.ResponseDto;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ResponseDto> userNotFoundException() {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("Invalid User");
		responseDto.setStatusCode(201);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDto);
	}
	
	

	@ExceptionHandler(SlotBookingFailedException.class)
	public ResponseEntity<ResponseDto> slotBookingFailedException() {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("Slot Booking Failed");
		responseDto.setStatusCode(201);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDto);
	}
	
}