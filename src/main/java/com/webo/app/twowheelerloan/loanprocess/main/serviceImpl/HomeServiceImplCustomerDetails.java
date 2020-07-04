package com.webo.app.twowheelerloan.loanprocess.main.ServiceImpl;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.Service.HomeServiceCustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepoitoryCustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepositoryEnquiryDetails;



@Service
public class HomeServiceImplCustomerDetails implements HomeServiceCustomerDetails {

	@Autowired
	HomeRepoitoryCustomerDetails cr;
	@Autowired
	HomeRepositoryEnquiryDetails edr;
	
	@Override
	public void saveData(CustomerDetails cd) {
		cr.save(cd);
	}

	@Override
	public Iterable<CustomerDetails> displayAll() {
		
		return cr.findAll();
	}

	@Override
	public void saveEnquiryData(EnquiryDetails ed) {
		edr.save(ed);
	}

	
	
	
}
