package com.webo.app.twowheelerloan.loanprocess.main.service;

import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;

public interface HomeServiceCustomerDetails {
	
	public void saveData(CustomerDetails cd);
	public Iterable<CustomerDetails> displayAll();
	
	
	
	
}
