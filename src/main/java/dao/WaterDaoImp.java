package dao;
import java.sql.SQLException;
import java.util.List;

import exception.DBException;
import model.Details;

public interface WaterDaoImp {
	void admin(Details water)throws  SQLException, DBException;

	 void admin1(int cans)throws  SQLException, DBException;

	void quantity(Details water)throws  SQLException, DBException;

	void status(Details water)throws  SQLException, DBException;

	void reserve(Details water)throws  SQLException, DBException;

	void reserve1(Details water)throws  SQLException, DBException;

	void reserveu(Details water)throws  SQLException, DBException;

	List<Details> viewStock() throws Exception;

	

}