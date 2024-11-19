package com.webapp3rdyear.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webapp3rdyear.config.DBConnectSQL;
import com.webapp3rdyear.enity.Accounts;

public class AccountsDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Accounts> getAllAccounts() {
		List<Accounts> list = new ArrayList<Accounts>();
		String query = "SELECT * FROM gardencentre.useraccount";
		try {
			conn = new DBConnectSQL().getDatabaseConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Accounts(rs.getInt(1),
						rs.getString(2),
						rs.getString(3)));
			}
			
		} catch (Exception ex) {
			
		}
		
		return list;
	}
	
}

