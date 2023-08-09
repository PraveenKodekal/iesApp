package com.majorProject.iesApp.adminModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.majorProject.iesApp.adminModule.binding.DashboardcardForm;
import com.majorProject.iesApp.adminModule.binding.LoginForm;
import com.majorProject.iesApp.adminModule.binding.UserAccountForm;
import com.majorProject.iesApp.adminModule.service.AccountService;
import com.majorProject.iesApp.adminModule.service.impl.AccountServiceImpl;
import com.majorProject.iesApp.adminModule.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@Autowired
	private AccountServiceImpl acService;
	
	
	//login
	@PostMapping("/login")
	public String login(@RequestBody LoginForm login) {
		String status=service.userLogin(login);
		
		if(status.equals("success")) {
			return "redirect:/dashboard?email="+login.getEmail();
		}else {
			return status;
		}
	}
	
	@GetMapping("/dashboard")
	public ResponseEntity<DashboardcardForm> buildDashBoard(@RequestParam("email") String email){
		UserAccountForm user= service.getUserByEmail(email);
		// get the users
		DashboardcardForm dashboard= service.fetchData();
		
		dashboard.setUser(user);
		return new ResponseEntity<DashboardcardForm>(dashboard, HttpStatus.OK);
	}
	
	

}
