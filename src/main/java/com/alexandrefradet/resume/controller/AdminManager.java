package com.alexandrefradet.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminManager {

	@GetMapping
	public String indexAdmin() {
		return "index";
	}
}
