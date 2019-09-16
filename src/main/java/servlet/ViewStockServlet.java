package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import model.Details;
import service.UserService;

public class ViewStockServlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	          
	       List<Details> list = null;
	   try {
	       UserService user = new UserService();
	       list=user.stockView();
	       } catch (Exception e) {
	       e.printStackTrace();
	   }
	   Gson gson = new Gson();
	   String json = gson.toJson(list);
	   PrintWriter out = response.getWriter();
	   out.println(json);
	   out.flush();
	   }
	}
