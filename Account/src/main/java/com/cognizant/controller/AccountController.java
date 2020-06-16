package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	
	@GetMapping("/accounts/{number}")
	public String getAccountDetails(@PathVariable String number)
	{
		String str = "Number: "+number+", Type: Savings ,Balance: 234534";
		return str;
		
	}

}
