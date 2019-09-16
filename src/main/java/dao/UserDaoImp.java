package dao;
import java.sql.SQLException;

import exception.DBException;
import model.AdminDetails;
import model.UserDetails;
public interface UserDaoImp {
	UserDetails login(String name, String setPassword) throws SQLException,DBException;
	UserDetails findByID(int id) throws SQLException,DBException;
	public int viewStock();
	public  AdminDetails adminLogin(AdminDetails admin) throws  SQLException,DBException;	
	void register(UserDetails details) throws SQLException, DBException;

	

}