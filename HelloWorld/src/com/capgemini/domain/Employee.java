package com.capgemini.domain;

public class Employee {
	private long employeeid;
	private String employeeName;
	private double employeeSalary;
	private String employeeDepartment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long employeeid, String employeeName, double employeeSalary, String employeeDepartment) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	

}
