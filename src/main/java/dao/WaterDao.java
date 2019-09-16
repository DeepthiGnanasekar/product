package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import dao.WaterDaoImp;
import model.Details;
import util.ConnectionUtil;

public class WaterDao implements WaterDaoImp {
	Connection con = ConnectionUtil.getConnection();
	 PreparedStatement pst = null;

	


	public void admin(Details water) {
		try {
			String sql = "insert into availability_List(Availability_List) values (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getAvailability_List());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void admin1(Details water) {
		try {
			String sql = "update availability_List set Availability_List=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getAvailability_List());
		  pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	public void quantity(Details water) {
		try {
			String sql = "insert into quantity_List(Quantity_List) values(?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getQuantyList());
			 pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void reserve(Details water) {
		try {
			String sql = "insert quantity_List(Reserved_List) values (?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getReservedList());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void reserveu(Details water) {
		try {
			String sql = "update quantity_List set Reserved_List=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getReservedList());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void reserve1(Details water) {
		try {
			String sql = "update quantity_List set Reserved_Order=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDouble(1, water.getReservedOrder());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void status(Details water) {
		try {
			String sql = "update quantity_List set STATUS=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, water.getStatus());
			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Details> viewStock() throws Exception{
	    
	    Connection con =null;
	    PreparedStatement pst = null;
	    List<Details> list = new ArrayList<Details>();
	    try {
	        con = ConnectionUtil.getConnection();
	        String sql = "select * from stock";
	        pst = con.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while(rs.next()) {
	            
	        	Details stock = new Details();
	            stock.setAvailability_List(rs.getInt("cans_avail"));
	            Date date = rs.getDate("date");
	            stock.setDate(date.toLocalDate());
	            list.add(stock);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw new Exception("Unable to View Stock",e);
	    }
	    return list;
	}
}