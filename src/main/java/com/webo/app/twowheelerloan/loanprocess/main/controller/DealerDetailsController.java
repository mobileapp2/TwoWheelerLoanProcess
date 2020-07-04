package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Bank_Details;
import com.webo.app.twowheelerloan.loanprocess.main.model.Dealer_Details;
import com.webo.app.twowheelerloan.loanprocess.main.service.DealerService;



@RestController
public class DealerDetailsController {

	@Autowired
	DealerService lps;
	
	
	  @RequestMapping("/getdealerdetails") 
	  public Dealer_Details prelogin() 
	  { 
		  Dealer_Bank_Details dbdc=new Dealer_Bank_Details();
		  dbdc.setDealer_bId(1);
	      dbdc.setDealer_BankName("SBI");
	      dbdc.setDealer_Name("HONDA");
	      dbdc.setDealer_BankIfscCode("SBIN000999");
	      dbdc.setDealer_BankAddress("Jaistambh");
	      dbdc.setDealer_AdharNo("909080807070");
	      dbdc.setDealer_AccountNo("1234567890");
	      
		  Dealer_Details ddc=new Dealer_Details();
		  ddc.setDealer_Id(1);
		  ddc.setDealer_Name("HondaCity");
		  ddc.setDealer_DoB("11/10/1970");
		  ddc.setDealer_EmailId("pqr@gmail.com");
		  ddc.setDealer_AdharCardNo("220709091212");
		  ddc.setDealer_MobNo("9098979695");
		  ddc.setDealer_LocalAddress("Pune");
		  ddc.setDealer_PermanentAddress("Mumbai");
		 ddc.setDealer_bankdetails(dbdc);
	 
	  return ddc;
	  }
	  
	  @RequestMapping(value="/postdealerdetails",method=RequestMethod.POST) 
	  public String registerdata(@RequestBody Dealer_Details ddc) 
	  {
		  lps.saveDealerDetailsController(ddc); 
		  return "ddc";
	  }
	  
}
