package com.Dao;

import java.util.List;

import com.Exception.AdminException;
import com.Exception.BuyerException;
import com.Exception.SellerException;
import com.Models.Admin;
import com.Models.Buyer;
import com.Models.Seller;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String insertAdminDetails(Admin adm) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginAdmin(String email, String password) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> getBuyerList() throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> getSellerList() throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
