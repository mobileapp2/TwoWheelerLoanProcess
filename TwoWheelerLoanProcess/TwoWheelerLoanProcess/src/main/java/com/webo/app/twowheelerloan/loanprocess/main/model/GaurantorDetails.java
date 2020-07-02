package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GaurantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guarantor_id;
	private String guarantor_Name;
	private String guarantor_DOB;
	private String guarantor_RelationshipWithConsumer;
	private String guarantor_Nobileno;
	private String guarantor_Adharcardno;
	private String guarantor_MortageDetails;
	private String guarantor_JobDetails;
	private String guarantor_LocalAddress;
	private String guarantor_PermanentAddress;
	

	
	public String getGuarantor_PermanentAddress() {
		return guarantor_PermanentAddress;
	}
	public void setGuarantor_PermanentAddress(String guarantor_PermanentAddress) {
		this.guarantor_PermanentAddress = guarantor_PermanentAddress;
	}
	public int getGuarantor_id() {
		return guarantor_id;
	}
	public void setGuarantor_id(int guarantor_id) {
		this.guarantor_id = guarantor_id;
	}
	public String getGuarantor_Name() {
		return guarantor_Name;
	}
	public void setGuarantor_Name(String guarantor_Name) {
		this.guarantor_Name = guarantor_Name;
	}
	public String getGuarantor_DOB() {
		return guarantor_DOB;
	}
	public void setGuarantor_DOB(String guarantor_DOB) {
		this.guarantor_DOB = guarantor_DOB;
	}
	public String getGuarantor_RelationshipWithConsumer() {
		return guarantor_RelationshipWithConsumer;
	}
	public void setGuarantor_RelationshipWithConsumer(String guarantor_RelationshipWithConsumer) {
		this.guarantor_RelationshipWithConsumer = guarantor_RelationshipWithConsumer;
	}
	public String getGuarantor_Nobileno() {
		return guarantor_Nobileno;
	}
	public void setGuarantor_Nobileno(String guarantor_Nobileno) {
		this.guarantor_Nobileno = guarantor_Nobileno;
	}
	public String getGuarantor_Adharcardno() {
		return guarantor_Adharcardno;
	}
	public void setGuarantor_Adharcardno(String guarantor_Adharcardno) {
		this.guarantor_Adharcardno = guarantor_Adharcardno;
	}
	public String getGuarantor_MortageDetails() {
		return guarantor_MortageDetails;
	}
	public void setGuarantor_MortageDetails(String guarantor_MortageDetails) {
		this.guarantor_MortageDetails = guarantor_MortageDetails;
	}
	public String getGuarantor_JobDetails() {
		return guarantor_JobDetails;
	}
	public void setGuarantor_JobDetails(String guarantor_JobDetails) {
		this.guarantor_JobDetails = guarantor_JobDetails;
	}
	public String getGuarantor_LocalAddress() {
		return guarantor_LocalAddress;
	}
	public void setGuarantor_LocalAddress(String guarantor_LocalAddress) {
		this.guarantor_LocalAddress = guarantor_LocalAddress;
	}
	

}
