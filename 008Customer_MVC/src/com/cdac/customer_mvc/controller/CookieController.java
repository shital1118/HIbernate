package com.cdac.customer_mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.customer_mvc.model.Customer;

/**
 * Servlet implementation class CookieController
 */
@WebServlet("/CookieController")
public class CookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//step 1: fetch req param
		
				//step 2: create customer object and store req param in it
				
				Customer customer=new Customer();
				customer.setFirstName(request.getParameter("firstName"));
				customer.setLastName(request.getParameter("lastName"));
				customer.setMobileNo(request.getParameter("mobileNo"));
				customer.setEmail(request.getParameter("email"));
				
				//how to create cookie
				//1.create cookie by obj passing
				String firstName=request.getParameter("firstName");
				Cookie cookie=new Cookie("firstName", firstName);
				
				//step 2: add the cookie to the response obj
					response.addCookie(cookie);
				//how to set age of the cookie
					cookie.setMaxAge(8);
					
					request.getRequestDispatcher("CustomerWelcomeServlet")
					.forward(request, response);
					
				
				
					
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
	}

}
