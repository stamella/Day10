package com.capgemini.bankapp.dao.ipml;

import java.util.HashSet;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.Customer;

public class BankAccountDaoImpl implements BankAccountDao {
	HashSet<Customer> customer;
	
	@Override
	public double getBalance(long accountId) {
		return getBalance(accountId);
	}

	@Override
	public boolean updateBalance(long accountId, double newBalance) {
	newBalance=getBalance(accountId);
return true;
	}
}



