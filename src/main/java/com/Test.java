package com;

import java.util.List;

import com.webapp3rdyear.dao.AccountsDAO;
import com.webapp3rdyear.enity.Accounts;

public class Test {
	public static void main(String[] args) {
		AccountsDAO dao =  new AccountsDAO();
		List<Accounts> list = dao.getAllAccounts();
		for (Accounts o : list) {
			System.out.println(o);
		}
	}
}

