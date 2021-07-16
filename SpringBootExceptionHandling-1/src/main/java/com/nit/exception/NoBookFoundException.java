package com.nit.exception;

public class NoBookFoundException extends RuntimeException{

	private static final long serialVersionUID = 5833633387700250830L;

	public NoBookFoundException(String msg) {

		super(msg);
	}
}
