package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UserController;


public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone_number = request.getParameter("phone_number");
       String setPassword = request.getParameter("password");
       PrintWriter out = response.getWriter();
      
      UserController uc=new UserController();
      String json=uc.login(phone_number,setPassword);
      out.print(json);
      out.flush();
    }
}
      /* UserDetails userDetails = null;
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
    } */




