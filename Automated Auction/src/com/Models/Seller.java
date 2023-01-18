package com.Models;

public class Seller {
	
	private int sellerId;
	private String seller_Name;
	private String email;
	private String password;
	private String status;
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int sellerId, String seller_Name, String email, String password, String status) {
		super();
		this.sellerId = sellerId;
		this.seller_Name = seller_Name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSeller_Name() {
		return seller_Name;
	}

	public void setSeller_Name(String seller_Name) {
		this.seller_Name = seller_Name;
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
		return "Seller [sellerId=" + sellerId + ", seller_Name=" + seller_Name + ", email=" + email + ", password="
				+ password + ", status=" + status + "]";
	}
	
	

}
