package com.suneratech;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class ServletProgram1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a + b;
		System.out.println("Performed Addition Operation\nSending for Square Operation");
		

		/*  Request Dispatcher
		 * --------------------
		 *  req.setAttribute("k", c);
		 *  PrintWriter pw = res.getWriter();
		 *	pw.println("In ServletProgram1 Starting the Servlet Process\nResult is : " + c + "\nTransforming to Servlet Program 2 for Square Function");
		 *	RequestDispatcher rd = req.getRequestDispatcher("sq");
		 *	rd.forward(req, res);
		 *
		 **/

		/*
		 * 	URL Rewriting
		 *  -------------
			res.sendRedirect("sq?k="+c);
		 */
		
		/* 	HttpSession
		 * 	------------
		 * 
		 * For to remove the session value we can use
		 * session.removeAttribute("k");
		 * HttpSession session = req.getSession();
		 * session.setAttribute("k", c);
		 * res.sendRedirect("sq");
		 */
		
		
		/*
		 * Cookies
		 * ======
		 * 
		 */
		Cookie cookie = new Cookie("k", c + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		 
	}
}
