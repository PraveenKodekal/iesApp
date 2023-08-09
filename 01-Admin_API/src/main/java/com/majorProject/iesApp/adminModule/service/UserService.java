package com.majorProject.iesApp.adminModule.service;

import com.majorProject.iesApp.adminModule.binding.DashboardcardForm;
import com.majorProject.iesApp.adminModule.binding.LoginForm;
import com.majorProject.iesApp.adminModule.binding.UserAccountForm;

public interface UserService {
	
	public String userLogin(LoginForm loginForm);
	
	public boolean recoverPassword(String email);
	
	public DashboardcardForm fetchData();
	
	public UserAccountForm getUserByEmail(String email);
	
	
	//MyProfile
	
	

}
