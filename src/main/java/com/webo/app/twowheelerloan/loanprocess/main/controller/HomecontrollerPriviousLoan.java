package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.PreviousLoanDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.Homeservice;

@Controller
@RestController
public class HomecontrollerPriviousLoan {
	
	
	@Autowired
	 Homeservice hs;
	
	@RequestMapping("/getalldatapriviousloan")
	public PreviousLoanDetails alldata() {
		
		
		PreviousLoanDetails previousLoanDetails=new PreviousLoanDetails();
		previousLoanDetails.setId(4);
		previousLoanDetails.setRemainingAmount(25000);
		previousLoanDetails.setRemainingEmi(3);
		
		

		
		
		hs.savedata(previousLoanDetails);
	
		return previousLoanDetails;
	}
	
	@PostMapping("/postalldatapriviousloan")
	public String getalldata(@RequestBody PreviousLoanDetails  priLoanDetails) {
		
		
		System.out.println(priLoanDetails.getId());
		System.out.println(priLoanDetails.getRemainingAmount());
		System.out.println(priLoanDetails.getRemainingEmi());
		
		hs.savedata(priLoanDetails);
		
		return "priLoanDetails post successfully";

	}


}
