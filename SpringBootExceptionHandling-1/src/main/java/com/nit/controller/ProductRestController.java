package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Product;
import com.nit.service.IProductService;

@RestController
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	@GetMapping(value = "/getProduct",produces = {"application/json"})
	public Product getProduct(@RequestParam("prodId") String prodId) {
		return service.findProductById(Integer.parseInt(prodId));
	}
}
