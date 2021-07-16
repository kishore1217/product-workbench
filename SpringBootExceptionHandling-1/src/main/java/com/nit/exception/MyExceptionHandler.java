package com.nit.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		System.out.println("Before");
		System.out.println("This is Release-2.2");
		model.addAttribute("errorMsg", "Problem Occured, Please Try Later...");
		
		return"errorMsg";
	}
	
	@ExceptionHandler(value = NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {
		model.addAttribute("error", "Sorry, No Book Found With The Given Id..!!");
		return"customError";
	}
	

}
