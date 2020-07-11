package me.blog.rookyhwan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleWebController {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@ResponseBody
	@RequestMapping("/status")
	public String home() {
		return "Spring boot is working!";
	}
}
