import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/add")
public class FirstServletProgram extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Result is :");
		System.out.println("Result is oeoweioS ");
		
	}
}
