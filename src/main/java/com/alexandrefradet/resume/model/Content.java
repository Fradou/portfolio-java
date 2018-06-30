package com.alexandrefradet.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Content {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String label;
	
	private String title;
	
	private String subtitle;
	
	private String body;
	
	private String url;
}
