package com.example.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@PostMapping("/calendar/inser")
	public String calendarInsert() {
		
		return "index.html";
	}
	
}
