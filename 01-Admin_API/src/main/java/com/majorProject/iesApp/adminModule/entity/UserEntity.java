package com.majorProject.iesApp.adminModule.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
	private String userName;
	private String userPwd;
	private Integer userPhNum;
	private String userGender;

	private LocalDate UserDOB;
	private Integer userSSN;
	private boolean activeStatus;
	private String RoleId;

	private LocalDate createdDate;
	private LocalDate updatedDate;

}
