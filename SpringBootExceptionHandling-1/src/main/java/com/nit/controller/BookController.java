package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.service.IBookService;

@Controller
public class BookController {

	@Autowired
	private IBookService service;
	@RequestMapping(value = "/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model) {
		
                                     System.out.println("This is a book controller class");
		Double bookPrice=service.findPriceById(bookId);
		model.addAttribute("price", "BookPrice: "+bookPrice);
		return"display";
	}
	
}
