package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/emp")
	public String getEmp(Model model) {
		model.addAttribute("msg", "Welcome to Spring Boot");
		String str=null;
		str.length();
		return"welcome";
	}
	/*
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		
		model.addAttribute("errorMsg", "Something Went Wrong Please Try Again...!!");
		
		return"errorMsg";
	}
	*/
}
