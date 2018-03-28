package com.alexandrefradet.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexandrefradet.resume.manager.SkillManager;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired SkillManager sManager;
	
	@GetMapping
	public String index(Model model) {
		
		model.addAttribute("skills", sManager.findAll());
		return "index";
	}
}
