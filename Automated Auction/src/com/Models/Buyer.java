package com.Models;

public class Buyer {
	
	private int buyerId;
	private String buyer_Name;
	private String email;
	private String password;
	private String status;
	
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buyer(int buyerId, String buyer_Name, String email, String password, String status) {
		super();
		this.buyerId = buyerId;
		this.buyer_Name = buyer_Name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyer_Name() {
		return buyer_Name;
	}

	public void setBuyer_Name(String buyer_Name) {
		this.buyer_Name = buyer_Name;
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
		return "Buyer [buyerId=" + buyerId + ", buyer_Name=" + buyer_Name + ", email=" + email + ", password="
				+ password + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
