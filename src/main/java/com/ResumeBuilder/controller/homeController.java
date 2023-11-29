package com.ResumeBuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ResumeBuilder.Entity.Person;

@Controller
public class homeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("person",new Person());
		return "form";
	}
	
	@PostMapping("/uploadResume")
	public String resumeInside(@ModelAttribute("person") Person person,Model model) {
		System.out.println(person);
		model.addAttribute("person",person);
		return "resume";
	}
}
