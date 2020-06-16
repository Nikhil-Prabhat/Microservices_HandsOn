package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController 
{
	
	@GetMapping("/loans/{number}")
	public String getLoan(@PathVariable String number)
	{
		String str = "Number: "+number+", Type:Car, Loan: 4000000, EMI: 2345, Tenure: 12";
		return str;
	}

}
