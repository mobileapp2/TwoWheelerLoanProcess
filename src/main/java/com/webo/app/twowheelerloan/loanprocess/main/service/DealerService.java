package com.webo.app.twowheelerloan.loanprocess.main.service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Bank_Details;
import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Details;

public interface DealerService {

	public void saveDealerDetailsController(Dealer_Details ddc);

	public void saveDealerBankDetailsController(Dealer_Bank_Details dbdc);
}
