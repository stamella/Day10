package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;
import com.capgemini.bankapp.serviceImpl.CustomerServiceImpl;


@WebServlet("/updateProfile")
public class  extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerService customerService;
    
    public UpdateProfileController() {
        super();
        customerService = new CustomerServiceImpl();
       
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerPassword = request.getParameter("password");
		String customerEmail = request.getParameter("emailId");
		String customerAddress = request.getParameter("address");
		String customerDob = request.getParameter("dob");

		LocalDate dob = LocalDate.parse(customerDob);
		RequestDispatcher dispatcher = null;
		Customer customer = new Customer(customerId,customerName,customerPassword,customerEmail,customerAddress,dob,null);
		customerService.updateProfile(customer);
		if (customer.getCustomerId() != 0) {
			dispatcher = request.getRequestDispatcher("successEdit.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}	
	}
}