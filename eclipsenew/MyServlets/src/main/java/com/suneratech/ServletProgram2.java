package com.suneratech;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletProgram2
 */
@WebServlet("/sq")
public class ServletProgram2 extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		/*  Request Dispatcher
		 * --------------------
		 * 
		 *  int k = (int)(req.getAttribute("k"));
		 *  k = k * k ;
		 *  System.out.println("Performing Square Operation");
		 *  PrintWriter pw = res.getWriter();
		 *  pw.println("Square of sum of nums is : "+k);
		 *  
		 **/


		/*
		 * 	URL Rewriting
		 *  -------------
		 *  

		 *	int k = Integer.parseInt(req.getParameter("k"));
		 *	k = k * k;
		 *	System.out.println("Performing Square Operation");
		 *	PrintWriter pw = res.getWriter();
		 *	pw.println("Square of sum of nums is : "+k);
		 *	
		 */

		/*
		 * Http Session
		 * ===========
		 * 
		 * HttpSession session = req.getSession();
		 * int k = (int) session.getAttribute("k");
		 * k = k * k ;
		 * PrintWriter pw = res.getWriter();
		 * pw.println("Square of sum of nums is : " + k);
		 */
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) 
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k * k ;
		PrintWriter pw = res.getWriter();
		pw.println("Square of sum of nums is : " + k);
		System.out.println("Task Completed");
		
		
		/**
		 * ServletContext
		 * ServletContext ctx = getServletContext();
		 * String str1 = ctx.getInitParameter("Name");
		 * String str2 = ctx.getInitParameter("Phone");
		 * pw.println("Hi, this is "+ str1 + " and I am using " + str2);
		 * 
		 */
		
		/**
		 * ServletConfig
		 * ServletConfig cg = getServletConfig();
		 * str1 = cg.getInitParameter("Qualify");
		 * str2 = cg.getInitParameter("Phone");
		 * pw.println("Hi, this is "+ str1 + " and I am using " + str2);
		 */

	}
}
