package com.alexandrefradet.resume.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ElementCollection
	@OrderColumn(name = "details_order")
	List<String> details;
}
