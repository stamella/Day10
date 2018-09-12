package com.capgemini.bankapp.dao.ipml;

import java.util.HashSet;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private HashSet<Customer> customer = new HashSet<>();

	@Override
	public Customer authenticate(Customer customer) {

		return customer;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		for (Customer customer1 : this.customer) {
			if (customer1.getCustomerId() == customer.getCustomerId()) {
				customer1.setCustomerName(customer.getCustomerName());
				customer1.setEmailId(customer.getEmailId());
				customer1.setAddress(customer.getAddress());
				customer1.setAccount(customer.getAccount());
				customer1.setDob(customer.getDob());
				customer1.setPassword(customer.getPassword());

			}
			return customer1;
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		for (Customer customer1 : this.customer) {
			if (customer1.getPassword() == oldPassword) {
				customer1.setPassword("newPassword");
			}
			return true;
		}
		return false;
	}

}