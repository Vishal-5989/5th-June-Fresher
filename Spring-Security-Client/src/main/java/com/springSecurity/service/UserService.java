package com.springSecurity.service;

import java.util.Optional;

import com.springSecurity.entity.User;
import com.springSecurity.entity.VerificationToken;
import com.springSecurity.model.UserModel;

public interface UserService {

	User registerUser(UserModel user);


	String validateVerificationToken(String token);


	void saveVerificationTokenForUser(String token, User user);


	VerificationToken genrateNewVerificationToken(String oldToken);


	User findUserByEmail(String email);


	void createPasswordResetTokenForUser(User user, String token);


	String validatePasswordResetToken(String token);


	Optional<User> getUserByPasswordResetToken(String token);


	void changePassword(User user, String newPassword);


	boolean checkIfValidOldPassword(User user, String oldPassword);

}
