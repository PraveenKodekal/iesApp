package com.majorProject.iesApp.adminModule.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class UnlockAccountForm {

	private String email;
	private String tempPwd;
	private String newPwd;
	private String confirmPwd;
}
