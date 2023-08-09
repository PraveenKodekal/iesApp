package com.majorProject.iesApp.adminModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.majorProject.iesApp.adminModule.binding.DashboardcardForm;
import com.majorProject.iesApp.adminModule.binding.LoginForm;
import com.majorProject.iesApp.adminModule.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	
	//login
	@PostMapping("/login")
	public String login(@RequestBody LoginForm login) {
		String status=service.userLogin(login);
		
		if(status.equals("success")) {
			return "redirect:/dashboard";
		}else {
			return status;
		}
	}
	
	@GetMapping("/dashboard")
	public ResponseEntity<DashboardcardForm> buildDashBoard(){
		DashboardcardForm dashboard= service.fetchData();
		return new ResponseEntity<DashboardcardForm>(dashboard, HttpStatus.OK);
	}
	
	

}
