package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Details;
import service.UserService;

public class OrderCanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderCan = request.getParameter("orderCans");
		int canOrder = Integer.parseInt(orderCan);
		 PrintWriter out = response.getWriter();
	       out.println("Enter Number Of Cans to be ordered :" + canOrder);
	       Details orderDetail = new Details();
	       try {
		       UserService service = new UserService();
		       orderDetail.setQuantyList(canOrder);
		       orderDetail = service.orderCan(orderDetail);
	  
	       }catch(Exception e) {
	           e.printStackTrace();
	       }
	       if(Details.getQuantyList()!=0) {
	           response.sendRedirect("index.jsp");
	       }
	       else {
	           response.sendRedirect("index.jsp?message=Invalid Login Crendentials!!!");
	       }
	    }

}
