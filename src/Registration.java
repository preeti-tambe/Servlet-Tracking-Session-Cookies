

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/regserv")
public class Registration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<b> Welcome To Registration Page GET</b><br/>");
		String name =  request.getParameter("uname");
		String pass =  request.getParameter("upass");
		
		
		out.print("NAME ="+name+"<br/>");
		out.print("Password="+pass+"<br/>");
		
		out.print("<a href='profile'>Link</a>");
		
		Cookie ck= new Cookie("uname", name);
		response.addCookie(ck);
		
		Cookie ck1= new Cookie("upass", pass);
		response.addCookie(ck1);
		
	
	}

}
