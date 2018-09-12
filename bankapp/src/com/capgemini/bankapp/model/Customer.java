package com.capgemini.bankapp.model;

public class Customer {
	private long customerId;
	private String customerName;
	private String password;
	private String emailId;
	private String address;
	private String dob;
	private String account ;
	
	public Customer() {
		super();
	}
	public Customer(long customerId, String customerName, String password, String emailId, String address, String dob,
			String account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.emailId = emailId;
		this.address = address;
		this.dob = dob;
		this.account = account;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", emailId=" + emailId + ", address=" + address + ", dob=" + dob + ", account=" + account + "]";
	}
	

}
