package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Cibil;
import com.webo.app.twowheelerloan.loanprocess.main.model.PreviousLoanDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.Homerepository;
import com.webo.app.twowheelerloan.loanprocess.main.repository.Homerepositorypriviousloan;
import com.webo.app.twowheelerloan.loanprocess.main.service.Homeservice;

@Service
public class HomeserviceImpl implements Homeservice {
	


	@Autowired
  Homerepository hr;
	
	@Autowired
	  Homerepositorypriviousloan hrp;
	



	@Override
	public void savedata(Cibil cibil) {
		 hr.save(cibil);
		
	}




	@Override
	public void savedata(PreviousLoanDetails previousLoanDetails) {
		 hrp.save(previousLoanDetails);
		
	}


	
	
	

}