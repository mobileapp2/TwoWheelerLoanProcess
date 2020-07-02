package com.webo.app.twowheelerloan.loanprocess.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loanprocess.main.model.Cibil;
import com.webo.app.twowheelerloan.loanprocess.main.service.Homeservice;

@Controller
@RestController
public class HomecontrollerCibil {
	
	
	@Autowired
	 Homeservice hs;
	
	@RequestMapping("/getalldatacibil")
	public Cibil alldata() {
		
		
	Cibil cibil=new Cibil();
      cibil.setCibilId(11);
      cibil.setCibilScore(718);
      cibil.setCibilScoreDateTime("12 june 20202,12.10");
      cibil.setLeadId(123);
      cibil.setRemark("aprroved");
      cibil.setStatus(400);
	
		
		

		
		
		hs.savedata(cibil);
	
		return cibil;
	}
	
	@PostMapping("/postalldatacibil")
	public String getalldata(@RequestBody Cibil cibil) {
		
		
	
		
		hs.savedata(cibil);
		
		return "cibildata post successfully";

	}


}
