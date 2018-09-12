package com.capgemini.bankapp.controllers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/checkBalance")
public class CheckBalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CheckBalanceController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.sendRedirect("balanceEnquiry.jsp");
	}

	
	
}