package com.kp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException 
	{
			
		System.out.println("welcome to java servlet programming");
		
		response.setContentType("text/html");
		
		PrintWriter out =  response.getWriter();
		
		out.println("Welcome to java servlet programming");
	
		
	}
	
	
	
	
	

}


	