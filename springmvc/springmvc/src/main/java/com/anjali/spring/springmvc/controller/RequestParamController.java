package com.anjali.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id,@RequestParam(value="name", required=true) String name, @RequestParam(value="email", required=false, defaultValue = "default") String email) {
		ModelAndView mv = new ModelAndView();
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("email: "+email);
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.addObject("email", email);
		mv.setViewName("showReqParams");
		return mv;
	}
}
