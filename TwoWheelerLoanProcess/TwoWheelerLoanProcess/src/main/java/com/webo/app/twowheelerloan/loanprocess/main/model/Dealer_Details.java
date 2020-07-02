package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dealer_Details {

	@Id
	private int dealer_Id;
	private String dealer_Name;
	private String dealer_DoB;
	private String dealer_EmailId;
	private String dealer_MobNo;
	private String dealer_AdharCardNo;
	private String dealer_LocalAddress;
	private String dealer_PermanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Dealer_Bank_Details dealer_bankdetails;
	public int getDealer_Id() {
		return dealer_Id;
	}
	public void setDealer_Id(int dealer_Id) {
		this.dealer_Id = dealer_Id;
	}
	public String getDealer_Name() {
		return dealer_Name;
	}
	public void setDealer_Name(String dealer_Name) {
		this.dealer_Name = dealer_Name;
	}
	public String getDealer_DoB() {
		return dealer_DoB;
	}
	public void setDealer_DoB(String dealer_DoB) {
		this.dealer_DoB = dealer_DoB;
	}
	public String getDealer_EmailId() {
		return dealer_EmailId;
	}
	public void setDealer_EmailId(String dealer_EmailId) {
		this.dealer_EmailId = dealer_EmailId;
	}
	public String getDealer_MobNo() {
		return dealer_MobNo;
	}
	public void setDealer_MobNo(String dealer_MobNo) {
		this.dealer_MobNo = dealer_MobNo;
	}
	public String getDealer_AdharCardNo() {
		return dealer_AdharCardNo;
	}
	public void setDealer_AdharCardNo(String dealer_AdharCardNo) {
		this.dealer_AdharCardNo = dealer_AdharCardNo;
	}
	public String getDealer_LocalAddress() {
		return dealer_LocalAddress;
	}
	public void setDealer_LocalAddress(String dealer_LocalAddress) {
		this.dealer_LocalAddress = dealer_LocalAddress;
	}
	public String getDealer_PermanentAddress() {
		return dealer_PermanentAddress;
	}
	public void setDealer_PermanentAddress(String dealer_PermanentAddress) {
		this.dealer_PermanentAddress = dealer_PermanentAddress;
	}
	public Dealer_Bank_Details getDealer_bankdetails() {
		return dealer_bankdetails;
	}
	public void setDealer_bankdetails(Dealer_Bank_Details dealer_bankdetails) {
		this.dealer_bankdetails = dealer_bankdetails;
	}
}
