package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserDetails;
import service.UserService;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
       String setPassword = request.getParameter("password");
       PrintWriter out = response.getWriter();
       out.println("Name:" + name);
      out.println("Password:" + setPassword );
        
       UserDetails userDetails = null;
       try {
	       UserService service = new UserService();
           userDetails = service.login(name,setPassword);
  
       }catch(Exception e) {
           e.printStackTrace();
       }
       if(userDetails.getName()==(userDetails.getName())&& userDetails.getSetPassword()==(userDetails.getSetPassword())) {
           response.sendRedirect("canSetUp.jsp");
       }
       else {
           response.sendRedirect("index.jsp?message=Invalid Login Crendentials!!!");
       }
    } 
}


