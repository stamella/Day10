package com.capgemini.bankapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customerLogin")
public class CustomerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	public CustomerLoginController() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String accountId = request.getParameter("accountId");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();

		request.setAttribute("accountId", accountId);
		request.setAttribute("password", password);
		response.sendRedirect("homePage.jsp");
	}

}
