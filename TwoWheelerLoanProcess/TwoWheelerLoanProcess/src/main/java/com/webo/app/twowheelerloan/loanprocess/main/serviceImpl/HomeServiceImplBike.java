package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Bike_Details;
import com.webo.app.twowheelerloan.loanprocess.main.repository.BikeDetailsRepository;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService {

	

	@Autowired
	BikeDetailsRepository ddrt;
	
	@Override
	public void saveBikeDetailsController(Bike_Details bidt) {
		// TODO Auto-generated method stub
		ddrt.save(bidt);
	}

}
