package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.EnquiryDetails;

@Repository
public interface HomeRepositoryEnquiryDetails extends CrudRepository<EnquiryDetails, Integer> {


}
