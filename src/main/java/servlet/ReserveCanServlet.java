package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Details;
import service.UserService;

public class ReserveCanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String reserveCan = request.getParameter("reserveCans");
   int canReserve = Integer.parseInt(reserveCan);
	 PrintWriter out = response.getWriter();
     out.println("Enter Number Of Cans to be reserved :" + canReserve);
     Details orderDetail = new Details();
     try {
	       UserService service = new UserService();
	       orderDetail.setReservedList(canReserve);
	       orderDetail = service.reserveCan(orderDetail);

     }catch(Exception e) {
         e.printStackTrace();
     }
     if(Details.getReservedList()!=0) {
         response.sendRedirect("index.jsp");
     }
     else {
         response.sendRedirect("index.jsp?message=Invalid Login Crendentials!!!");
     }
	}
}
