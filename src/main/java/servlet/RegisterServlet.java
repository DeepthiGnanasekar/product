package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserDetails;
import service.UserService;

public class RegisterServlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String name= request.getParameter("name");
		   String mobileNumber= request.getParameter("mobile");
		   int mobile = Integer.parseInt(mobileNumber);
	       String setPassword = request.getParameter("password");
	       PrintWriter out = response.getWriter();
	       out.println("Name:"+name);
	       out.println("MobileNumber:" + mobile);
	       out.println("SetPassword:" + setPassword );
	       UserDetails user = new UserDetails();
	       user.setName(name);
	       user.setMobileNumber(mobile);
	       user.setSetPassword(setPassword);
	       UserService service = new UserService();
	       try {
	    	   service.register(user);
	           response.sendRedirect("index.jsp");
	       } catch (Exception e) {
	           e.printStackTrace();
	           response.sendRedirect("register.jsp?message="+e.getMessage());
	       }
	   }
}
