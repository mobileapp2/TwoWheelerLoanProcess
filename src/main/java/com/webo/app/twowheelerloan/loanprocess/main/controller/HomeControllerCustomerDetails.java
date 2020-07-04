package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webo.app.twowheelerloan.loanprocess.main.model.CustomerDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceCustomerDetails;

import antlr.collections.List;



@RestController
public class HomeControllerCustomerDetails {
	
	@Autowired
	HomeServiceCustomerDetails cds;
	
	@Autowired
	RestTemplate rstemp;
	
	@RequestMapping("/getmasterdata")
	public List logindata()
	{
		String url="http://localhost:8083/customerbank";
		List list=rstemp.getForObject(url, List.class);
		return list;
		
	}
	
	
	
	@RequestMapping(value = "/savecustomerdetails", method = RequestMethod.POST)
	public void savecustomerdetails(@RequestBody CustomerDetails cd)
	{
		cds.saveData(cd);
	}
	
	@GetMapping("/getcustomerdetails")
	public Iterable<CustomerDetails> getcustomerdetails() {
		
		Iterable list=cds.displayAll();
		return list;
	}

}
