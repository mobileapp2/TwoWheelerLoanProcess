package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceEnquiryDetails;

import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepositoryEnquiryDetails;

@RestController
public class HomeControllerEnquiryDetails {
	
	@Autowired
	HomeServiceEnquiryDetails hsed;
	
	
	@RequestMapping(value = "/saveenquirydetails", method = RequestMethod.POST)
	public void saveenquirydetails(@RequestBody EnquiryDetails ed)
	{
		hsed.saveEnquiryData(ed);
	}

	@GetMapping("/getenquirydetails")
	public Iterable<EnquiryDetails> getenquirydetails() {
		
		Iterable list=hsed.displayAll();
		return list;
	}


}
