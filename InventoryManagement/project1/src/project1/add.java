package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet {
	public void Service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		String i = req.getParameter("num1");
		String j = req.getParameter("num2");
		String k=i+j;
		PrintWriter out = res.getWriter();
		out.println("Answer = "+k);
	}
	
}
