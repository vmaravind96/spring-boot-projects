package com.project.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymeLeafController {
	
	@GetMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World");
		return "helloWorld"; // same as html page
	}
	
	@GetMapping("/style")
	public String styleDisplay(Model model) {
		return "cssJsDemo"; // same as html page
	}
}
