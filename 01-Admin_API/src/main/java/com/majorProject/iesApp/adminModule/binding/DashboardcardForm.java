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
	
	private UserAccountForm user;

}
