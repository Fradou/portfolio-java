package com.alexandrefradet.resume.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Experience {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String company;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
}
