package com.alexandrefradet.resume.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@Column(columnDefinition = "text")
	private String description;
	
	private String url;
	
	private String img;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	@ElementCollection
	@OrderColumn(name = "details_order")
	List<String> environmentDetails;
}
