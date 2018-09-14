package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/customerLogin")
public class CustomerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService;



	public CustomerLoginController() {
		super();
		customerService = new CustomerServiceImpl();
		
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("customerEmail");
		String password = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		Customer customer = new Customer(0, "", password, email, "", null, null);
		
		customer = customerService.authenticate(customer);
		if (customer.getCustomerId() != 0) {
			HttpSession session = request.getSession();
			session.setAttribute("Customer",customer);
			session.setMaxInactiveInterval(180);
			dispatcher = request.getRequestDispatcher("homePage.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}
}
