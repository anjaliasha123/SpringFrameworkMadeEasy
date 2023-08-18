package com.anjali.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anjali.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("/object")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("objectView");
		mv.addObject("emp", new Employee(1, "Ashish", 50000));
		return mv;
	}
}
