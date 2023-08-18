package com.anjali.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("id", 1);
		mv.addObject("name", "Ashley");
		mv.addObject("salary", 80000);
		return mv;
	}
}
