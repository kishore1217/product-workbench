package com.nit.service.impl;

import org.springframework.stereotype.Service;

import com.nit.exception.NoProductFoundException;
import com.nit.model.Product;
import com.nit.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Override
	public Product findProductById(Integer prodId) {
 
		if (prodId==101) {
			return new Product(101, "COREJAVA", 450.2);
		} else {
            throw new NoProductFoundException("No Product Found ");
		}
		
	}

	
}
