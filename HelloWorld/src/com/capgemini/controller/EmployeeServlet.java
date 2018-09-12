package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;


@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> employee = new ArrayList<>();
       
    
    public EmployeeServlet() {
        super();
        
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	employee.add(new Employee(100,"Gayle",80000,"java"));
    	employee.add(new Employee(101,"Hyle",50000,"SAP"));
    	employee.add(new Employee(102,"Sree",40000,"BI"));
   }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("employee/html");
		
		PrintWriter out = response.getWriter();
		String employeeid = request.getParameter("employeeid");
		int empid = Integer.parseInt(employeeid);
		int count=0;
		
		for(Employee e: employee) {
		if(e.getEmployeeid()==empid) {
		  count = 1;
			out.println("<table border = '1'><tr><th>EmployeeId</th><th>EmployeeName</th><th>EmployeeSalary</th><th>Department</th></tr>");
			out.println("<tr><td>" +e.getEmployeeid()+"</td><td>"+e.getEmployeeName()+"</td><td>"+e.getEmployeeSalary()+"</td><td>" +e.getEmployeeDepartment());
		
		}
		out.println("</table>");
		
	}
	if(count==0) {
		out.println("Employee doesnt exists");
	}

	out.close();
	}
}
