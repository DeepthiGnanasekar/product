package model;

import java.time.LocalDate;

public class Details {
	
	private int availability_List;
	private LocalDate date;
	private static int quantyList;
	private static int reservedList;
	private int reservedOrder;
	private int quanty;
	private String status;

	
	public int getAvailability_List() {
		return availability_List;
	}

	public void setAvailability_List(int availability_List) {
		this.availability_List = availability_List;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public static int getQuantyList() {
		return quantyList;
	}

	public void setQuantyList(int quantyList) {
		this.quantyList = quantyList;
	}

	public static double getReservedList() {
		return reservedList;
	}

	public void setReservedList(int reservedList) {
		this.reservedList = reservedList;
	}

	public double getReservedOrder() {
		return reservedOrder;
	}

	public void setReservedOrder(int reservedOrder) {
		this.reservedOrder = reservedOrder;
	}

	public  int getQuanty() {
		return quanty;
	}

	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
