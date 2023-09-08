package com.springSecurity.entity.listener;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.springSecurity.entity.User;
import com.springSecurity.event.RegistrationCompleteEvent;
import com.springSecurity.service.UserService;

import lombok.extern.slf4j.Slf4j;
import java.util.logging.Logger;

@Component
@Slf4j
public class RegistrationCompleteEventListner implements ApplicationListener<RegistrationCompleteEvent>{
		
//	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(RegistrationCompleteEventListner.class.getName());
	
	Logger log
    = Logger.getLogger(
    		RegistrationCompleteEventListner.class.getName());
	
	@Autowired
	UserService userService;

	@Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the Verification Token for the User with Link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token,user);
        //Send Mail to user
        String url =
                event.getApplicationUrl()
                        + "/verifyRegistration?token="
                        + token;

        //sendVerificationEmail()
        log.info("Click the link to verify your account: {}" + url);
    }
	
}
