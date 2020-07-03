package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Cibil;

import com.webo.app.twowheelerloan.loanprocess.main.repository.HomerepositoryCibil;

import com.webo.app.twowheelerloan.loanprocess.main.service.HomeserviceCibil;

@Service
public class HomeserviceImplCibil implements HomeserviceCibil {
	


	@Autowired
  HomerepositoryCibil hr;
	



	@Override
	public void savedata(Cibil cibil) {
		 hr.save(cibil);
		
	}


	
	
	

}