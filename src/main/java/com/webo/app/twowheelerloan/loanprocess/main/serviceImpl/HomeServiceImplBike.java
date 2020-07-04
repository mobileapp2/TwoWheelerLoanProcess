package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Bike_Details;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepositoryBikeDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceBike;


@Service
public class HomeServiceImplBike implements HomeServiceBike {

	@Autowired

	HomeRepositoryBikeDetails ddrt;
	
	@Override
	public void saveBikeDetailsController(Bike_Details bidt) {
		// TODO Auto-generated method stub
		ddrt.save(bidt);
	}
}