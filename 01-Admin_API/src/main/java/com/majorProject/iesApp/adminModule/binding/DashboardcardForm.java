package com.majorProject.iesApp.adminModule.binding;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DashboardcardForm {
	
	private long plansCnt;
	private Integer approveCnt;
	private Integer deniedCnt;
	private Integer benefitAmtGiven;
	//contain all the info to display all the user data
	private UserAccountForm user;

}
