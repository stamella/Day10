package com.capgemini.bankapp.service.ipml;

import java.util.HashSet;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	private HashSet<Customer> customer = new HashSet<>();
	BankAccountDao bankAccountDao;

	@Override
	public double getBalance(long accountId) {

		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) {

		return (bankAccountDao.getBalance(accountId) - amount);
	}

	@Override
	public double deposit(long accountId, double amount) {

		return (bankAccountDao.getBalance(accountId) + amount);
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
		if (withdraw(fromAcc, amount) != -1) {
			deposit(toAcc, amount);
			return true;
		}
		return false;
	}

}