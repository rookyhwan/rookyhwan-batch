package me.blog.rookyhwan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
}