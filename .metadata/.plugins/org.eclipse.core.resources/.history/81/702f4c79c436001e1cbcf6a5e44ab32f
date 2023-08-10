package com.majorProject.iesApp.adminModule.service.impl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majorProject.iesApp.adminModule.binding.UnlockAccountForm;
import com.majorProject.iesApp.adminModule.binding.UserAccountForm;
import com.majorProject.iesApp.adminModule.entity.UserEntity;
import com.majorProject.iesApp.adminModule.repo.UserRepository;
import com.majorProject.iesApp.adminModule.service.AccountService;
import com.majorProject.iesApp.adminModule.utils.EmailUtils;

/**
 * @author Admin
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private EmailUtils emailUtils;

	/**
	 * @implNote userCreation
	 *
	 */
	@Override
	public boolean createUser(UserAccountForm userForm) {

		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(userForm, user);

		// set Random Password
		user.setUserPwd(OTP().toString());

		// set acc Status
		user.setActiveStatus("LOCKED");
		user.setAccountSwch("Y");

		repo.save(user);

		
		// send email
				String subject = "User Registration";
				String body = readEmailBody("REG_EMAIL_BODY.txt", user);
				return emailUtils.sendEmail(subject, body, userForm.getEmail());
		
	}

	private String readEmailBody(String filename, UserEntity user) {
		StringBuilder sb = new StringBuilder();
		try (Stream<String> lines = Files.lines(Paths.get(filename))) {
			lines.forEach(line -> {
				line = line.replace("${FNAME}", user.getUserName());
				line = line.replace("${TEMP_PWD}", user.getUserPwd());
				line = line.replace("${EMAIL}", user.getEmail());
				sb.append(line);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * @implNote To view All the Users
	 *
	 */
	@Override
	public List<UserAccountForm> fetchUserAccounts() {

		// get all the users from repo
		List<UserEntity> userEntity = repo.findAll();

		List<UserAccountForm> allUsers = new ArrayList<UserAccountForm>();

		// copy the entity data into binding object
		for (UserEntity user : userEntity) {

			UserAccountForm allUserForm = new UserAccountForm();
			BeanUtils.copyProperties(user, allUserForm);
			allUsers.add(allUserForm);

		}

		return allUsers;
	}

	/**
	 * @implNote Based on the userId retrive the record and make edit and update the
	 *           record if the given id record not available return null
	 *
	 */
	@Override
	public UserAccountForm userAccIdById(Integer userId) {

		Optional<UserEntity> optional = repo.findById(userId);
		if (optional.isPresent()) {
			UserEntity entity = optional.get();
			UserAccountForm user = new UserAccountForm();
			BeanUtils.copyProperties(entity, user);
			return user;
		}
		return null;
	}

	/**
	 * @implNote change the account status write a custom query to update the
	 *           accountStatus
	 */
	@Override
	public String changeAccStatus(Integer userId, String status) {

		int cnt = repo.updateAccStatus(userId, status);
		if (cnt > 0) {
			return "Status Changed";
		}

		return "status not changed";
	}

	@Override
	public String unlockAcc(UnlockAccountForm unlockForm) {

		UserEntity entity = repo.findByEmail(unlockForm.getEmail());
		entity.setUserPwd(unlockForm.getNewPwd());
		entity.setActiveStatus("UNLOCKED");

		repo.save(entity);
		return "Account Unlocked";
	}

	// To generate Otp

	private char[] OTP() {

		int len = 6;
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
	}

}
