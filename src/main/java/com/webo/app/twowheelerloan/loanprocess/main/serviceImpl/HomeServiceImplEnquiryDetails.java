package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepositoryEnquiryDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceEnquiryDetails;

public class HomeServiceImplEnquiryDetails implements HomeServiceEnquiryDetails {

	@Autowired
	HomeRepositoryEnquiryDetails hred;
	
	
	@Override
	public void saveEnquiryData(EnquiryDetails ed) {
	hred.save(ed);	
	}

	@Override
	public Iterable<EnquiryDetails> displayAll() {
		
		return hred.findAll();
	}

}
