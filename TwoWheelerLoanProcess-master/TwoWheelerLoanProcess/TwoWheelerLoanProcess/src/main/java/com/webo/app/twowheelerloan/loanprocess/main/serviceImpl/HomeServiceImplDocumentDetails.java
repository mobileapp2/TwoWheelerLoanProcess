package com.webo.app.twowheelerloan.loanprocess.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loanprocess.main.model.DocumentDetails;
import com.webo.app.twowheelerloan.loanprocess.main.repository.HomeRepositoryDocumentDetails;
import com.webo.app.twowheelerloan.loanprocess.main.service.HomeServiceDocumentDetails;


@Service
public class HomeServiceImplDocumentDetails implements HomeServiceDocumentDetails {
	
	  @Autowired 
	  HomeRepositoryDocumentDetails hr;

	@Override
	public void savedata(DocumentDetails doc) {
		hr.save(doc);
		
	}
}
