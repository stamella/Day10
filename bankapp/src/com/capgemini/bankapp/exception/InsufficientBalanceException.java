package com.capgemini.bankapp.exception;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}