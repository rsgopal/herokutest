package com.janakan.herokutest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Value("${TEST_KEY}")
	private String testKey;

	@GetMapping("")
	public String main(Model model) {
		model.addAttribute("testKey", testKey);
		return "home";
	}
}
