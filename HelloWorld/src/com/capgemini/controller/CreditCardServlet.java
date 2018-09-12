package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/creditcard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreditCardServlet() {
		super();

	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		String CardHolderName = request.getParameter("CardHolderName");
		String ExpiryMonth = request.getParameter("ExpiryMonth");
		String ExpiryYear = request.getParameter("ExpiryYear");
		String CVV = request.getParameter("CVV");
		int expirymonth = Integer.parseInt(ExpiryMonth);
		int expiryyear = Integer.parseInt(ExpiryYear);
		int cvv = Integer.parseInt(CVV);
		out.println("Card HolderName : " + CardHolderName  + "\nExpiry Month :" + expirymonth + "\nExpiry Year:"
				+ expiryyear + "\nCVV:" + cvv);
		out.close();
	}

}
