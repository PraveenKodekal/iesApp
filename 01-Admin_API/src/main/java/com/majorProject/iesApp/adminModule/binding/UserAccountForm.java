package com.majorProject.iesApp.adminModule.binding;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccountForm {
	
	private String userName;
	private String email;
	private Long userPhNum;
	private String userGender;

	private LocalDate dob;
	private Long userSSN;
	private String accountSwch;
	
	
	private Integer RoleId;

}
