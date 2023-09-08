package com.springSecurity.service.impl;

import java.util.Calendar;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springSecurity.entity.PasswordResetToken;
import com.springSecurity.entity.User;
import com.springSecurity.entity.VerificationToken;
import com.springSecurity.model.UserModel;
import com.springSecurity.repository.PasswordResetTokenRepository;
import com.springSecurity.repository.UserRepository;
import com.springSecurity.repository.VerificationTokenRepository;

@Service
public class UserServiceImpl implements com.springSecurity.service.UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private VerificationTokenRepository verificationTokenRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private PasswordResetTokenRepository passwordTokenRepository;
	
	@Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));

        userRepository.save(user);
        return user;
    }

	@Override
    public void saveVerificationTokenForUser(String token, User user) {
        VerificationToken verificationToken
                = new VerificationToken(user, token);

        verificationTokenRepository.save(verificationToken);
    }
	
	@Override
    public String validateVerificationToken(String token) {
        VerificationToken verificationToken
                = verificationTokenRepository.findByToken(token);

        if (verificationToken == null) {
            return "invalid";
        }

        User user = verificationToken.getUser();
        Calendar cal = Calendar.getInstance();

        if ((verificationToken.getExpirationTime().getTime()
                - cal.getTime().getTime()) <= 0) {
            verificationTokenRepository.delete(verificationToken);
            return "expired";
        }

        user.setEnabled(true);
        userRepository.save(user);
        return "valid";
    }

	@Override
	public VerificationToken genrateNewVerificationToken(String oldToken) {
		VerificationToken verificationToken = verificationTokenRepository.findByToken(oldToken);
		verificationToken.setToken(UUID.randomUUID().toString());
		verificationTokenRepository.save(verificationToken);
		return verificationToken;
	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public void createPasswordResetTokenForUser(User user, String token) {
		PasswordResetToken passwordResetToken = new PasswordResetToken(user, token);
		passwordTokenRepository.save(passwordResetToken);
	}

	@Override
	public String validatePasswordResetToken(String token) {
		
		PasswordResetToken passwordResetToken = passwordTokenRepository.findByToken(token);
		
		if (passwordResetToken == null) {
		    return "invalid";
		}
		
		User user = passwordResetToken.getUser();
		Calendar cal = Calendar.getInstance();
		
		if ((passwordResetToken.getExpirationTime().getTime()
		        - cal.getTime().getTime()) <= 0) {
			passwordTokenRepository.delete(passwordResetToken);
		    return "expired";
		}
		
//		user.setEnabled(true);
//		userRepository.save(user);
		return "valid";
		
	}

	@Override
	public Optional<User> getUserByPasswordResetToken(String token) {
		return Optional.ofNullable(passwordTokenRepository.findByToken(token).getUser());
	}

	@Override
	public void changePassword(User user, String newPassword) {
		user.setPassword(passwordEncoder.encode(newPassword));
		userRepository.save(user);
	}

	@Override
	public boolean checkIfValidOldPassword(User user, String oldPassword) {
		return passwordEncoder.matches(oldPassword, user.getPassword());
	}
	
}
