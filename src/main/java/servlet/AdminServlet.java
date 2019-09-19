package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.AdminController;



public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String adminName = request.getParameter("name");
	       String adminPassword = request.getParameter("password");
	       PrintWriter out = response.getWriter();
	   
	   AdminController admin=new AdminController();
	   String json=admin.adminLogin(adminName,adminPassword);
	   out.print(json);
	   out.flush();
	}
}
	       /*AdminDetails admin = new AdminDetails();
	       admin.setName(adminName);
	       admin.setPassword(adminPassword);
	       try {
	    	   UserService service = new UserService();
	    	   admin = service.adminLogin(admin);
	    	   System.out.println(admin);
	       }catch(Exception e) {
	           e.printStackTrace();
	       }
	       if(admin.getName().equals("Admin")&&(admin.getPassword().equals("a@123"))) {
	    	   response.sendRedirect("adminSetUp.jsp");
	       }
	       else {
	          response.sendRedirect("index.jsp?message=Invalid Login Crendentials!!!");
	       }*/
	
	


