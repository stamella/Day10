package com.capgemini.bankapp.daoImpl;

import java.util.Set;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.database.DummyDataBase;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Set<Customer> customers = DummyDataBase.getCustomer();

	@Override
	public Customer authenticate(Customer customer) {
		for (Customer c : customers) {
			if ((c.getEmailId().equals(customer.getEmailId()))&&(c.getPassword().equals(customer.getPassword()))) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
	
		for (Customer c : customers) {
			if (c.getEmailId().equals(customer.getEmailId())) {
				if (c.getPassword().equals(customer.getPassword())) {
					c.setCustomerName(customer.getCustomerName());
					c.setEmailId(customer.getEmailId());
					c.setAddress(customer.getAddress());
					c.setCustomerDateOfBirth(customer.getCustomerDateOfBirth());
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		
		for (Customer c : customers) {
			if (c.getEmailId().equals(customer.getEmailId())) {
				if (c.getPassword() == oldPassword) {
					c.setPassword(newPassword);
					return true;
				}
			}
		}
		return false;
	}
}