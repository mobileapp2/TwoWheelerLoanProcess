package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.GaurantorDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeserviceGuarantorDetails;

@RestController
public class HomecontrollerGaurantorDetails {


	@Autowired
	HomeserviceGuarantorDetails hs;
	
	  @RequestMapping("/getgaurantordetails") 
	  public GaurantorDetails prelogin() { 
		  
		  GaurantorDetails gd=new GaurantorDetails();
		                   gd.setGuarantor_id(1);
		                   gd.setGuarantor_Name("Nilesh Mohale");
		                   gd.setGuarantor_DOB("05/08/1991");
		                   gd.setGuarantor_RelationshipWithConsumer("frinds");
		                   gd.setGuarantor_Nobileno("9545834000");
		                   gd.setGuarantor_Adharcardno("808008080uj");
		                   gd.setGuarantor_MortageDetails("hh");
		                   gd.setGuarantor_JobDetails("Soft Developer");
		                   gd.setGuarantor_LocalAddress("Pune");
		                   gd.setGuarantor_PermanentAddress("Malegaon");
		                   return gd;
	  
	  }
	  
	  @RequestMapping(value = "/postgaurantordetails",method =RequestMethod.POST ) 
	  public String registerdata(@RequestBody GaurantorDetails gd) {
		  hs.savedata(gd);
	  
	      return "gd";
	  
	  }
}
