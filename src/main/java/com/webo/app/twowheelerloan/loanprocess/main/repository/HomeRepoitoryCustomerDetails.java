package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
@Repository
public interface HomeRepoitoryCustomerDetails extends CrudRepository<CustomerDetails, Integer>{

}
