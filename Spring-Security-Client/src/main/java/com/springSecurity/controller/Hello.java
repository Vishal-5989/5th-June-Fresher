package com.springSecurity.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/api/hello")
	public String hello(Principal principal) {
		return "Hello welcome to spring security";
	}

}