package com.majorProject.iesApp.adminModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.majorProject.iesApp.adminModule.binding.UserAccountForm;
import com.majorProject.iesApp.adminModule.service.impl.AccountServiceImpl;

@RestController
public class AccountController {
	
	@Autowired
	private AccountServiceImpl service;
	
	@PostMapping("/user")
	public ResponseEntity<String> createUserAccount(@RequestBody UserAccountForm userForm){
		
		 boolean status= service.createUser(userForm);
		 if(status) {
			 return new ResponseEntity<>("Accont Created ", HttpStatus.CREATED);//201
		 }
		 else {
			 return new ResponseEntity<>("Account Not Created ", HttpStatus.INTERNAL_SERVER_ERROR);//500
		 }
				
	}
	
	
	//view Accounts
	@GetMapping("/allUsers")
	public ResponseEntity<List<UserAccountForm>> allUsers(){
		List<UserAccountForm> status = service.fetchUserAccounts();
		return new ResponseEntity<List<UserAccountForm>>(status, HttpStatus.OK);
	}
	
	
	// One Uer Account Edit
	@GetMapping("/edit/{userId}")
	public ResponseEntity<UserAccountForm> getUser(@PathVariable("userId") Integer userId){
		UserAccountForm form=service.userAccIdById(userId);
		return new ResponseEntity<UserAccountForm>(form, HttpStatus.OK);
	}
	
	//change the user Status
	@PutMapping("/update/{userId}/{status}")
	public ResponseEntity<List<UserAccountForm>> updateUserAcc(@PathVariable("userId")Integer userId,
																@PathVariable("status") String status){
		List<UserAccountForm> allUsers= service.fetchUserAccounts();
		return new ResponseEntity<List<UserAccountForm>>(allUsers, HttpStatus.OK);
	}

}
