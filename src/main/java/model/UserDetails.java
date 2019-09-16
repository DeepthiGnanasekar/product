package model;

public class UserDetails {
	private int id;
	private String name;
	private int mobileNumber;
	private String setPassword;

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ",name=" + name + ", mobileNumber=" + mobileNumber + ", setPassword=" + setPassword + "]";
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobile) {
		this.mobileNumber = mobile;
		
	}
	public String getSetPassword() {
		return setPassword;
	}

	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}

	
}
