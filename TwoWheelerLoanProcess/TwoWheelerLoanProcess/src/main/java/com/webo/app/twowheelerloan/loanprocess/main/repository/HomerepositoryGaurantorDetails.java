package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.GaurantorDetails;

@Repository
public interface HomerepositoryGaurantorDetails extends CrudRepository<GaurantorDetails, Integer>{

}
