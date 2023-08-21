package com.anjali.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anjali.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("/registerPage")
	public String showRegistrationForm() {
		return "regForm";
	}
	@RequestMapping(value="registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap map) {
		System.out.println(user);
		map.addAttribute("user", user);
		return "registeredUser";
	}

}
