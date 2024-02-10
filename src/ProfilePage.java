

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/profile")
public class ProfilePage extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<b> Welcome To Profile Page GET</b><br/>");
		
		
		Cookie c[]=request.getCookies();
		String name=c[0].getValue();
		String pass=c[1].getValue();
		
		
		out.print("NAME ="+name+"<br/>");
		out.print("PASSWORD ="+pass+"<br/>");
		
		out.print("<a href='contact'>Link</a>");
		
	}

}
