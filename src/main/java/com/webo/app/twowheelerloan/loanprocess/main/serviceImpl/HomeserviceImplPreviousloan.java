package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.Cibil;
import com.webo.app.twowheelerloan.loanprocess.main.model.PreviousLoanDetails;

import com.webo.app.twowheelerloan.loanprocess.main.repository.Homerepositorypreviousloan;

import com.webo.app.twowheelerloan.loanprocess.main.service.HomeservicepreviousLoan;

@Service
public class HomeserviceImplPreviousloan implements HomeservicepreviousLoan {

	@Autowired
	Homerepositorypreviousloan hrp;

	@Override
	public void savedata(PreviousLoanDetails previousLoanDetails) {
		hrp.save(previousLoanDetails);

	}

}