package com.registration.registrationSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.registrationSystem.Service.UserService;

@RestController
public class AOPController {
	@Autowired
	private UserService userService;
	@GetMapping("/aop-add")
	public String GetBaseMethod() {
		return userService.addUser("prashant");
	}

}
