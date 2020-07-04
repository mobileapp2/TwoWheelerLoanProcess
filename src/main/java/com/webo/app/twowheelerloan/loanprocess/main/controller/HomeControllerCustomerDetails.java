package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceCustomerDetails;



@RestController
public class HomeControllerCustomerDetails {
	
	@Autowired
	HomeServiceCustomerDetails cds;
	
	
	@RequestMapping(value = "/savecustomerdetails", method = RequestMethod.POST)
	public void savecustomerdetails(@RequestBody CustomerDetails cd)
	{
		cds.saveData(cd);
	}
	
	@GetMapping("/getcustomerdetails")
	public Iterable<CustomerDetails> getcustomerdetails() {
		
		Iterable list=cds.displayAll();
		return list;
	}

}
