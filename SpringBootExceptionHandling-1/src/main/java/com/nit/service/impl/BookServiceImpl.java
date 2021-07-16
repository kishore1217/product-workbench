package com.nit.service.impl;

import org.springframework.stereotype.Service;

import com.nit.exception.NoBookFoundException;
import com.nit.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{

	@Override
	public Double findPriceById(String bookId) {

		if (bookId.equals("B101")) {
			return 450.0;
		} else {
            throw new NoBookFoundException("No Book Found With The Given Id");
		}
	}
}
