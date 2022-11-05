package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out =response.getWriter();
		out.print("<br/><h1>Accessing content parameters in servlet 1</h1>");
		out.print("sql = " + config.getInitParameter("sql"));
		out.print("<br/> Message = " + config.getInitParameter("message"));
		
		out.print("<br/><h1>Accessing content parameters in servlet 1</h1>");
		ServletContext application = getServletContext();
		out.print("Driver Name = " + application.getInitParameter("driver"));
		out.print("<br/> Url = " + application.getInitParameter("url"));
		
	}


}
