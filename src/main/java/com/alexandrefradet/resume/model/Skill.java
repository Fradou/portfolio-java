package com.alexandrefradet.resume.model;

import java.util.List;

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
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@ElementCollection
	@OrderColumn(name = "details_order")
	List<String> details;
}
