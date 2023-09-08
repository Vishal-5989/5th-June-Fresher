package com.authorizationServer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.authorizationServer.service.CustomAuthenticationProvider;

@EnableWebSecurity
public class DefaultSecurityConfig {
	
	@Autowired
	CustomAuthenticationProvider customAuthenticationProvider;

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated()
				).formLogin(Customizer.withDefaults());
		return http.build();
	}
	
	@Autowired
	public void bindAuthenticationProviderr(AuthenticationManagerBuilder authenticationManagerBuilder) {
		authenticationManagerBuilder.authenticationProvider(customAuthenticationProvider);
	}
}
