package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnquiryDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cutomer_id;
	private String customer_name;
	private String customer_dob;
	private String customer_mobno;
	private String customer_adharno;
	private String customer_localaddress;
	private String customer_permanentaddress;
	private double customer_loanamount_required;
	private String customer_profession;
	private String customer_gender;
	public int getCutomer_id() {
		return cutomer_id;
	}
	public void setCutomer_id(int cutomer_id) {
		this.cutomer_id = cutomer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_dob() {
		return customer_dob;
	}
	public void setCustomer_dob(String customer_dob) {
		this.customer_dob = customer_dob;
	}
	public String getCustomer_mobno() {
		return customer_mobno;
	}
	public void setCustomer_mobno(String customer_mobno) {
		this.customer_mobno = customer_mobno;
	}
	public String getCustomer_adharno() {
		return customer_adharno;
	}
	public void setCustomer_adharno(String customer_adharno) {
		this.customer_adharno = customer_adharno;
	}
	public String getCustomer_localaddress() {
		return customer_localaddress;
	}
	public void setCustomer_localaddress(String customer_localaddress) {
		this.customer_localaddress = customer_localaddress;
	}
	public String getCustomer_permanentaddress() {
		return customer_permanentaddress;
	}
	public void setCustomer_permanentaddress(String customer_permanentaddress) {
		this.customer_permanentaddress = customer_permanentaddress;
	}
	public double getCustomer_loanamount_required() {
		return customer_loanamount_required;
	}
	public void setCustomer_loanamount_required(double customer_loanamount_required) {
		this.customer_loanamount_required = customer_loanamount_required;
	}
	public String getCustomer_profession() {
		return customer_profession;
	}
	public void setCustomer_profession(String customer_profession) {
		this.customer_profession = customer_profession;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	
	
	
}
