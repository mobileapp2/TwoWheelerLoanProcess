package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.GaurantorDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomerepositoryGaurantorDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.Homeservice;

@Service
public class HomeserviceImpl implements Homeservice{

	@Autowired
	HomerepositoryGaurantorDetails hrgds;

	@Override
	public void savedata(GaurantorDetails gd) {
		
		hrgds.save(gd);
		
	}
	
 

}
