package com.event.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "new_event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long event_id;

//	@NotBlank(message = "Event name is required")
	private String event_name;

	

//	@NotBlank(message = "Client name is required")
	private String client_name;


	@Enumerated(EnumType.STRING)
	@NotNull
	private Type event_type;

	private double budge;

	
	private String contactNo;

	
	private LocalDateTime date_of_booking;

	
	private String city;

}
