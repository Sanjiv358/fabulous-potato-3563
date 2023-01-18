package com.Models;

public class Admin {
	
	private int adminId;
	private String admin_Name;
	private String email;
	private String password;
	private String status;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId, String admin_Name, String email, String password, String status) {
		super();
		this.adminId = adminId;
		this.admin_Name = admin_Name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdmin_Name() {
		return admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", admin_Name=" + admin_Name + ", email=" + email + ", password="
				+ password + ", status=" + status + "]";
	}
	
	
	
	

}
