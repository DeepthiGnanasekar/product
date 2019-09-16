package service;


import java.sql.SQLException;
import java.util.List;

import dao.UserDao;
import dao.UserDaoImp;
import dao.WaterDao;
import dao.WaterDaoImp;
import exception.DBException;
import model.AdminDetails;
import model.Details;
import model.UserDetails;
import validator.UserValidator;

public class UserService {
UserDaoImp userdao = new UserDao();
	WaterDaoImp waterdao = new WaterDao();
     public void register(UserDetails details) {
    	 	try {
			userdao.register(details);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DBException e) {
			e.printStackTrace();
		}
     }
     public UserDetails login(String name,String setPassword) {
    	 UserDetails details = null;
    	 try {
    		 details = userdao.login(name,setPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DBException e) {
			e.printStackTrace();
		}
		return details;
     }
     public  AdminDetails adminLogin(AdminDetails admin) {
    	
    	 try {
    		 admin=userdao.adminLogin(admin);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DBException e) {
			e.printStackTrace();
		}
		return admin;
    	 
     }
     public int viewStock() {
    	int stock = userdao.viewStock();
    	 return stock ;
     }
     
     public Details orderCan(Details order) {
    	
			try {
				waterdao.quantity(order);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (DBException e) {
				e.printStackTrace();
			}
			return order;
		
     }
     
     public Details reserveCan(Details order) {
     	
			try {
				waterdao.reserve(order);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (DBException e) {
				e.printStackTrace();
			}
			return order;
		
  }
     public List<Details> stockView() throws Exception {
         WaterDaoImp dao = new WaterDao();
         List<Details> list = null;
         try {
             list = dao.viewStock();
         } catch (DBException e) {
             e.printStackTrace();
         }
         System.out.println();
         return list;
     }
}
