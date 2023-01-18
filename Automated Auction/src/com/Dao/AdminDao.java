package com.Dao;

import java.util.List;

import com.Exception.AdminException;
import com.Exception.BuyerException;
import com.Exception.SellerException;
import com.Models.Admin;
import com.Models.Buyer;
import com.Models.Seller;

public interface AdminDao {
	
	public String insertAdminDetails(Admin adm) throws AdminException;
	
	public String loginAdmin(String email, String password) throws AdminException;
	
	public List<Buyer> getBuyerList() throws BuyerException;
	
	public List<Seller> getSellerList() throws SellerException;

}
