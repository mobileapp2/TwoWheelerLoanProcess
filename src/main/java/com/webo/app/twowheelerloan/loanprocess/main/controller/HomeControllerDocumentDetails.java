package com.webo.app.twowheelerloan.loanprocess.main.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.DocumentDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceDocumentDetails;


@RestController
public class HomeControllerDocumentDetails {
	@Autowired
	HomeServiceDocumentDetails hs;
	@RequestMapping(value = "/getdetails",method = RequestMethod.GET)
	public DocumentDetails prelogin()
	{
		DocumentDetails doc=new DocumentDetails();
		doc.setDocumentId(1);
		doc.setCustomerId("A1");
		doc.setAddressProof("Electricity Bill");
		doc.setBankStatement("ok");
		doc.setItrFile("Generated");
		doc.setPhoto("a1.jpg");
		doc.setPostDatedCheck("ACV54355D");
		doc.setSignature("abc");
		doc.setThumb("vc");
		doc.setBankcheck("65466g");
		doc.setSalarySlip("ASD44546");
		doc.setAdharcard("987456321021");
		doc.setPancard("ASQER8976Q");
		doc.setPreviousLoanStatement("No Previous Loan");
		
		return doc;
		
	}
	 @RequestMapping(value="/postdetail",method = RequestMethod.POST) 
	  public String save(@RequestBody DocumentDetails doc) 
	  { 
		  hs.savedata(doc);
		
	  return "Register Data"; 
	  }
}
