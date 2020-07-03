package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Details;



@Repository
public interface DealerDetailsRepository extends CrudRepository<Dealer_Details, Integer>{

}
