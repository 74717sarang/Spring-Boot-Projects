package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.model.Event;
import com.event.service.EventServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("event/")
public class EventController {

	@Autowired
	private EventServiceImpl eventService;
	
	@GetMapping("hello/")
	public String get()
	{
		return "hello ";
	}


	@PostMapping("add/")
	public ResponseEntity<?>addEvent(@RequestBody Event event){
		if(event!=null) {
			eventService.addEvent(event);
			 return ResponseEntity.status(HttpStatus.CREATED).body("event add done");
		}
		else {
		return	ResponseEntity.status(HttpStatus.BAD_REQUEST).body("not added...");
	
		}
		
	}
	
	
	
}
