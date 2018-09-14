package com.capgemini.bankapp.controller;

import java.io.IOException;

import javax.naming.InsufficientResourcesException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.bankapp.exception.InsufficientBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.serviceImpl.BankAccountServiceImpl;

@WebServlet("/fundTransfer")
public class FundTransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BankAccountService bankAccountService;
    
    public FundTransferController() {
        super();
        bankAccountService = new BankAccountServiceImpl();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		long fromAccId = Integer.parseInt(request.getParameter("fromAccId"));
		long toAccId = Integer.parseInt(request.getParameter("toAccId"));
		long amount = Integer.parseInt(request.getParameter("amount"));
		RequestDispatcher dispatcher = null;
		BankAccount account = new BankAccount(fromAccId,"",0);
		try {
		
			if(bankAccountService.fundTransfer(fromAccId, toAccId, amount))
			{
				
				dispatcher = request.getRequestDispatcher("successfullTransfer.jsp");
				dispatcher.forward(request, response);
			} else {
				dispatcher = request.getRequestDispatcher("error.jsp");
				dispatcher.forward(request, response);
			}
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
}