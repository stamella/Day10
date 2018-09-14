package com.capgemini.bankapp.model;

import java.time.LocalDate;

public class Customer {
	private long customerId;
	private String customerName;
	private String password;
	private String emailId;
	private String address;
	private LocalDate customerDateOfBirth;
	private BankAccount customerAccount;

	public Customer(long customerId, String customerName, String password, String emailId, String address,
			LocalDate customerDateOfBirth, BankAccount customerAccount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.emailId = emailId;
		this.address = address;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAccount = customerAccount;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}
	public void setCustomerDateOfBirth(LocalDate customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}
	public BankAccount getCustomerAccount() {
		return customerAccount;
	}
	public void setCustomerAccount(BankAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", emailId=" + emailId + ", address=" + address + ", customerDateOfBirth=" + customerDateOfBirth
				+ ", customerAccount=" + customerAccount + "]";
	}
}
	