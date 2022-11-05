package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginController
 */
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginController() {
        
    	super();
    	// TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		out.print("<br/>Hello");
		
		
		RequestDispatcher rd = null;
		if(username.equalsIgnoreCase("tom") && password.equals("jerry")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);	
		}
		else {
		rd = request.getRequestDispatcher("login.html");
	
		out.print("<center> <span style = 'color:red'> Invalid Credential!</span></center>");
			
		}
		
		
	

	}

}
