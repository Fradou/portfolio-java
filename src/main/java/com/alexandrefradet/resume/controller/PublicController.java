package com.alexandrefradet.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandrefradet.resume.manager.ContentManager;
import com.alexandrefradet.resume.manager.ExperienceManager;
import com.alexandrefradet.resume.manager.ProjectManager;
import com.alexandrefradet.resume.manager.SkillManager;
import com.alexandrefradet.resume.model.Content;
import com.alexandrefradet.resume.model.Experience;
import com.alexandrefradet.resume.model.Project;
import com.alexandrefradet.resume.model.Skill;

@RestController
@RequestMapping("/public")
public class PublicController {
	
	@Autowired
	private SkillManager sManager;
	
	@Autowired
	private ContentManager cManager;
	
	@Autowired
	private ExperienceManager eManager;
	
	@Autowired
	private ProjectManager pManager;
	
	@GetMapping("skills")
	public List<Skill> getSkills(){
		return sManager.findAll();
	}
	
	@GetMapping("experiences")
	public List<Experience> getExperiences(){
		return eManager.findAll();
	}
	
	@GetMapping("projects")
	public List<Project> getProjects(){
		return pManager.findAll();
	}
	
	@GetMapping("contents")
	public List<Content> getContent(){
		return cManager.findAll();
	}
}
