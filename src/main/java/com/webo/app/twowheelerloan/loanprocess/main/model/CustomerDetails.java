package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String customer_mob;
	private String cutomer_emailid;
	private String customer_gender;
	private int customer_age;
	private String customer_qualification;
	private double customer_income_details;
	private String customer_occupation_type;
	private int loan_no;
	private String marital_status;
	private int cutomer_status_code;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_mob() {
		return customer_mob;
	}
	public void setCustomer_mob(String customer_mob) {
		this.customer_mob = customer_mob;
	}
	public String getCutomer_emailid() {
		return cutomer_emailid;
	}
	public void setCutomer_emailid(String cutomer_emailid) {
		this.cutomer_emailid = cutomer_emailid;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	public int getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}
	public String getCustomer_qualification() {
		return customer_qualification;
	}
	public void setCustomer_qualification(String customer_qualification) {
		this.customer_qualification = customer_qualification;
	}
	public double getCustomer_income_details() {
		return customer_income_details;
	}
	public void setCustomer_income_details(double customer_income_details) {
		this.customer_income_details = customer_income_details;
	}
	public String getCustomer_occupation_type() {
		return customer_occupation_type;
	}
	public void setCustomer_occupation_type(String customer_occupation_type) {
		this.customer_occupation_type = customer_occupation_type;
	}
	public int getLoan_no() {
		return loan_no;
	}
	public void setLoan_no(int loan_no) {
		this.loan_no = loan_no;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public int getCutomer_status_code() {
		return cutomer_status_code;
	}
	public void setCutomer_status_code(int cutomer_status_code) {
		this.cutomer_status_code = cutomer_status_code;
	}
	
	
	
	
	
}
