package com.webo.app.twowheelerloan.loanprocess.main.service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Cibil;
import com.webo.app.twowheelerloan.loanprocess.main.model.PreviousLoanDetails;;


public interface Homeservice {
	public void savedata(Cibil cibil) ;
	public void savedata( PreviousLoanDetails previousLoanDetails) ;
	
}
