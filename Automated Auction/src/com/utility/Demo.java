package com.utility;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		Connection c = DBUtil.provideConnection();
		if(c!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection not established");
		}
	}
}
