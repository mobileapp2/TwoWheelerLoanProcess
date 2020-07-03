package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Bank_Details;
import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Details;
import com.webo.app.twowheelerloan.loanprocess.main.repository.DealerBankDetailsRepository;
import com.webo.app.twowheelerloan.loanprocess.main.repository.DealerDetailsRepository;
import com.webo.app.twowheelerloan.loanprocess.main.service.DealerService;

public class DealerServiceImpl implements DealerService {

	@Autowired
	DealerDetailsRepository ddrp;
	

	@Override
	public void saveDealerDetailsController(Dealer_Details ddc) {
		
	ddrp.save(ddc);
		
	}
	
	@Autowired
	DealerBankDetailsRepository dbdrp;
     
	@Override
	public void saveDealerBankDetailsController(Dealer_Bank_Details dbdc) {
		dbdrp.save(dbdc);
		
	}

}
