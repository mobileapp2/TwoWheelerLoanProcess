package com.webo.app.twowheelerloan.loanprocess.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loanprocess.main.model.DocumentDetails;
@Repository
public interface HomeRepositoryDocumentDetails extends JpaRepository<DocumentDetails, Integer>
{
	}
