package com.webo.app.twowheelerloan.loanprocess.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike_Details 
{
	@Id
	private int vehicle_Id;
	private String vehicle_Registration_No;
	private String vehicle_engine_No;
	private String vehicle_chassis_No;
	private String vehical_Type;
	private String vehicle_Company;
	private String vehicle_Model;
	private int vehicle_Model_No;
	private String vehicle_color;
	private int actual_Price;
	private String fuel_Type;
	@OneToOne(cascade = CascadeType.ALL)
	private Dealer_Details Dealer;
	public int getVehicle_Id() {
		return vehicle_Id;
	}
	public void setVehicle_Id(int vehicle_Id) {
		this.vehicle_Id = vehicle_Id;
	}
	public String getVehicle_Registration_No() {
		return vehicle_Registration_No;
	}
	public void setVehicle_Registration_No(String vehicle_Registration_No) {
		this.vehicle_Registration_No = vehicle_Registration_No;
	}
	public String getVehicle_engine_No() {
		return vehicle_engine_No;
	}
	public void setVehicle_engine_No(String vehicle_engine_No) {
		this.vehicle_engine_No = vehicle_engine_No;
	}
	public String getVehicle_chassis_No() {
		return vehicle_chassis_No;
	}
	public void setVehicle_chassis_No(String vehicle_chassis_No) {
		this.vehicle_chassis_No = vehicle_chassis_No;
	}
	public String getVehical_Type() {
		return vehical_Type;
	}
	public void setVehical_Type(String vehical_Type) {
		this.vehical_Type = vehical_Type;
	}
	public String getVehicle_Company() {
		return vehicle_Company;
	}
	public void setVehicle_Company(String vehicle_Company) {
		this.vehicle_Company = vehicle_Company;
	}
	public String getVehicle_Model() {
		return vehicle_Model;
	}
	public void setVehicle_Model(String vehicle_Model) {
		this.vehicle_Model = vehicle_Model;
	}
	public int getVehicle_Model_No() {
		return vehicle_Model_No;
	}
	public void setVehicle_Model_No(int vehicle_Model_No) {
		this.vehicle_Model_No = vehicle_Model_No;
	}
	public String getVehicle_color() {
		return vehicle_color;
	}
	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	public int getActual_Price() {
		return actual_Price;
	}
	public void setActual_Price(int actual_Price) {
		this.actual_Price = actual_Price;
	}
	public String getFuel_Type() {
		return fuel_Type;
	}
	public void setFuel_Type(String fuel_Type) {
		this.fuel_Type = fuel_Type;
	}
	public Dealer_Details getDealer() {
		return Dealer;
	}
	public void setDealer(Dealer_Details dealer) {
		Dealer = dealer;
	}
	
}
