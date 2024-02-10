

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		out.print("<b> Welcome To Contact Page GET</b><br/>");
		
		
		Cookie c[]=request.getCookies();
		String name=c[0].getValue();
		String pass=c[1].getValue();
		
		
		out.print("NAME ="+name+"<br/>");
		out.print("PASSWORD ="+pass+"<br/>");
	}

}
