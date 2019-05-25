package com.cdac.customer_mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerWelcomeServlet
 */
@WebServlet("/CustomerWelcomeServlet")
public class CustomerWelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerWelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting the cookie
		Cookie [] cookies=request.getCookies();
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		//get the key and the value of the cookie
		
		for(Cookie c1:cookies) {
			pw.println("<h1> Cookie Name : "+c1.getName()
			+"-Cookie Name :"+c1.getValue()+"</h1>");
		}
		pw.println("<a href='LogoutCookieServlet'>Logout</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
