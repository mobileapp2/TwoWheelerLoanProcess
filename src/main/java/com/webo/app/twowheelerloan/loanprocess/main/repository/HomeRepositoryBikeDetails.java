package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.Bike_Details;

@Repository
public interface HomeRepositoryBikeDetails extends CrudRepository<Bike_Details, Integer>{

}
