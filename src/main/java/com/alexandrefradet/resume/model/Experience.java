package com.alexandrefradet.resume.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String company;
	
	private String companyLogo;
	
	private String position;
	
	private LocalDate startDate;
	
	private LocalDate endDate;

	@Column(columnDefinition = "text")
	private String description;

	@OneToMany(mappedBy = "experience")
	private List<Mission> missions;
}
