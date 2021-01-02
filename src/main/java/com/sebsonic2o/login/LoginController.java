package com.sebsonic2o.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String doGet() {
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doPost(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!loginService.isUserValid(name, password)) {
			model.put("authErrorMessage", "wrong name or password");
			return "login";
		}

		model.put("name", name);
		return "welcome";
	}
}
