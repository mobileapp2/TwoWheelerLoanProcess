package com.webo.app.twowheelerloan.loanprocess.main.service;

import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;

public interface HomeServiceEnquiryDetails {
	
	public void saveEnquiryData(EnquiryDetails ed);
	public Iterable<EnquiryDetails> displayAll();

}
