package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Bank_Details;



@Repository
public interface DealerBankDetailsRepository extends CrudRepository<Dealer_Bank_Details, Integer>{

}

