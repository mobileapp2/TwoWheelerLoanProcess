package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Dealer_Bank_Details {
    
	@Id
	private int dealer_bId;
	private String dealer_Name;
	private String dealer_AdharNo;
	private String dealer_AccountNo;
	private String dealer_BankName;
	private String dealer_BankIfscCode;
	private String dealer_BankAddress;
	public int getDealer_bId() {
		return dealer_bId;
	}
	public void setDealer_bId(int dealer_bId) {
		this.dealer_bId = dealer_bId;
	}
	public String getDealer_Name() {
		return dealer_Name;
	}
	public void setDealer_Name(String dealer_Name) {
		this.dealer_Name = dealer_Name;
	}
	public String getDealer_AdharNo() {
		return dealer_AdharNo;
	}
	public void setDealer_AdharNo(String dealer_AdharNo) {
		this.dealer_AdharNo = dealer_AdharNo;
	}
	public String getDealer_AccountNo() {
		return dealer_AccountNo;
	}
	public void setDealer_AccountNo(String dealer_AccountNo) {
		this.dealer_AccountNo = dealer_AccountNo;
	}
	public String getDealer_BankName() {
		return dealer_BankName;
	}
	public void setDealer_BankName(String dealer_BankName) {
		this.dealer_BankName = dealer_BankName;
	}
	public String getDealer_BankIfscCode() {
		return dealer_BankIfscCode;
	}
	public void setDealer_BankIfscCode(String dealer_BankIfscCode) {
		this.dealer_BankIfscCode = dealer_BankIfscCode;
	}
	public String getDealer_BankAddress() {
		return dealer_BankAddress;
	}
	public void setDealer_BankAddress(String dealer_BankAddress) {
		this.dealer_BankAddress = dealer_BankAddress;
	}
}
