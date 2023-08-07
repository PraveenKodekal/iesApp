package com.majorProject.iesApp.adminModule.service;

import java.util.List;

import com.majorProject.iesApp.adminModule.binding.UserAccountForm;

public interface AccountService {
	
	
	public boolean createUser(UserAccountForm userForm);
	
	//to view accounts
	List<UserAccountForm> fetchUserAccounts();
	
	//toEdit and update Account
	public UserAccountForm userAccIdById(Integer userId);
	
	// status
	public String changeAccStatus(Integer accId, String status);
	
	
}
