package service;
import java.sql.SQLException;

import dao.AdminDao;
import dao.WaterDao;
import exception.DBException;
import model.AdminDetails;

public class AdminService {
	
	AdminDao admindao = new AdminDao();
	WaterDao waterdao = new WaterDao();
	
	 public  AdminDetails adminLogin(String name,String password) {
		 AdminDetails admin = null;
    	 try {
    		 admin=new AdminDetails();
    		 admin=admindao.adminLogin(name,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DBException e) {
			e.printStackTrace();
		}
		return admin;
    	 
     }
	 
}
