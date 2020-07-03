package com.webo.app.twowheelerloan.loanprocess.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int remainingEmi;
	private double remainingAmount;
	/*
	 * @OneToOne(cascade = CascadeType.ALL) private BankDetails bankdetails;
	 */
	
	//Setter and getter starts
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRemainingEmi() {
		return remainingEmi;
	}
	public void setRemainingEmi(int remainingEmi) {
		this.remainingEmi = remainingEmi;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}


}
