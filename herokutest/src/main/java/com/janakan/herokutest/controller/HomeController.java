package com.janakan.herokutest.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("")
	public String main(Model model, final Principal principal) {
		if (principal == null) {
			return "redirect:" + LogoutController.LOGOUT_PATH;
		}
		model.addAttribute("userId", principal.getName());
		return "home";
	}
}
