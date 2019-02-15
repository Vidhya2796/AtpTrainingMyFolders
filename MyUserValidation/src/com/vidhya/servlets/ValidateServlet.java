package com.vidhya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidhya.dao.InvalidUserException;
import com.vidhya.dao.UserDAO;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		RequestDispatcher requestDispatcher=null;
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		String userType="Invalid";
		try {
			userType=getUserType(userName,password);
			if (userType.equalsIgnoreCase("admin")) {
				requestDispatcher=request.getRequestDispatcher("/admin");
			} else if (userType.equalsIgnoreCase("user")) {
				requestDispatcher=request.getRequestDispatcher("/user");
			} else{
				requestDispatcher=request.getRequestDispatcher("/invalid");
			}
			
			
		} catch (InvalidUserException e) {
			out.print(e.getMessage());
		}
		requestDispatcher.forward(request, response);
		
	}


	private String getUserType(String userName, String password) {
		UserDAO dao=new UserDAO();//tight coupling
		return dao.getUserType( userName,  password);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
