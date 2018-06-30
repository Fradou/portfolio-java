package com.alexandrefradet.resume.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Content {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String label;
	
	private String title;
	
	private String subtitle;

	@Column(columnDefinition = "text")
	private String body;
	
	private String url;
}
