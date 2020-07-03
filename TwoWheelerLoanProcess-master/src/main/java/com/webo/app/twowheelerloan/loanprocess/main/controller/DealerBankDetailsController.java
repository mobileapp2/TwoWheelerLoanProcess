package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Bank_Details;
import com.webo.app.twowheelerloan.loanprocess.main.service.DealerService;



@RestController
public class DealerBankDetailsController {

	@Autowired
	DealerService ds;
	
	
	  @RequestMapping("/getdealerbankdetails") 
	  public Dealer_Bank_Details prelogin() 
	  {  
		  Dealer_Bank_Details dbdc=new Dealer_Bank_Details();
		  dbdc.setDealer_bId(1);
	      dbdc.setDealer_BankName("SBI");
	      dbdc.setDealer_Name("HONDA");
	      dbdc.setDealer_BankIfscCode("SBIN000999");
	      dbdc.setDealer_BankAddress("Jaistambh");
	      dbdc.setDealer_AdharNo("909080807070");
	      dbdc.setDealer_AccountNo("1234567890");
	  
	  return dbdc; }
	  
	  @RequestMapping(value="/postdealerbankdetails",method=RequestMethod.POST) 
	  public String registedata(@RequestBody Dealer_Bank_Details dbdc) 
	  {
		  ds.saveDealerBankDetailsController(dbdc); 
		  return "dbdc";
	  }
	  
}
