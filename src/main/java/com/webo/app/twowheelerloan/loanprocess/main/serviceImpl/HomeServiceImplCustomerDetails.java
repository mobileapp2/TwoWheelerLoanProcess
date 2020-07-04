package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceCustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;

import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepoitoryCustomerDetails;




@Service
public class HomeServiceImplCustomerDetails implements HomeServiceCustomerDetails {

	@Autowired
	HomeRepoitoryCustomerDetails cr;
	
	
	@Override
	public void saveData(CustomerDetails cd) {
		cr.save(cd);
	}

	@Override
	public Iterable<CustomerDetails> displayAll() {
		
		return cr.findAll();
	}

	
	
	
	
}
