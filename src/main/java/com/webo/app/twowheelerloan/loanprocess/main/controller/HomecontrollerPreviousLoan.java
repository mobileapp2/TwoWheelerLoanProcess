package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.PreviousLoanDetails;

import com.webo.app.twowheelerloan.loanprocess.main.service.HomeservicepreviousLoan;

@Controller
@RestController
public class HomecontrollerPreviousLoan {
	
	
	@Autowired
	 HomeservicepreviousLoan hs;
	
	@RequestMapping("/getpreviousloan")
	public PreviousLoanDetails alldata() {
		
		
		PreviousLoanDetails previousLoanDetails=new PreviousLoanDetails();
		previousLoanDetails.setId(4);
		previousLoanDetails.setRemainingAmount(25000);
		previousLoanDetails.setRemainingEmi(3);
		
		

		
		
		hs.savedata(previousLoanDetails);
	
		return previousLoanDetails;
	}
	
	@PostMapping("/postpreviousloan")
	public String getalldata(@RequestBody PreviousLoanDetails  priLoanDetails) {
		
		
		System.out.println(priLoanDetails.getId());
		System.out.println(priLoanDetails.getRemainingAmount());
		System.out.println(priLoanDetails.getRemainingEmi());
		
		hs.savedata(priLoanDetails);
		
		return "previousLoanDetails post successfully";

	}


}
