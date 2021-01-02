package com.sebsonic2o.login;

public class LoginService {

	public boolean isUserValid(String name, String password) {

		return name.equals("seb") && password.equals("1234");
	}
}
