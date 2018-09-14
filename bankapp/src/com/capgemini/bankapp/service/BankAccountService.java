package com.capgemini.bankapp.service;

import com.capgemini.bankapp.exception.InsufficientBalanceException;

public interface BankAccountService {
	public double getBalance(long accountId);
	public double withdraw(long accountId, double amount) throws InsufficientBalanceException;
	public double deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) throws InsufficientBalanceException;


}