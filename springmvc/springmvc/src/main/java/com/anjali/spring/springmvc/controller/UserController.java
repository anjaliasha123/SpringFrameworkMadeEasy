package com.anjali.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anjali.spring.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("/registerPage")
	public ModelAndView showRegistrationForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("regForm");
		return mv;
	}
	@RequestMapping(value="registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("registeredUser");
		
		return mv;
	}

}
