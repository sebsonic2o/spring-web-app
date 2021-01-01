package com.sebsonic2o.jee;

public class LoginService {

	public boolean isUserValid(String name, String password) {

		return name.equals("seb") && password.equals("1234");
	}
}
