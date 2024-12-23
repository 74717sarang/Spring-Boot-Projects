package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.model.Event;
import com.event.model.Type;
import com.event.repository.EventRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventServiceImpl implements EventService  {

	@Autowired
	private EventRepository eventRepository; 
	
	
	
	@Override
	public void addEvent(Event event) {

		Event newEvent=new Event();
		newEvent.setBudge(event.getBudge());
		newEvent.setCity(event.getCity());
		newEvent.setClient_name(event.getClient_name());
		newEvent.setContactNo(event.getContactNo());
		newEvent.setDate_of_booking(event.getDate_of_booking());
		newEvent.setEvent_name(event.getEvent_name());
		newEvent.setEvent_type(event.getEvent_type());
		
		eventRepository.save(newEvent);
		
		return ;
	}

}
