package com.insurance.property;



public class Insurance {

	private int insuranceId;
	private String insuranceName;
	private double insurancePrice;
	private String insuranceType;
	
	
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public double getInsurancePrice() {
		return insurancePrice;
	}
	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}
	
	
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	
	public Insurance(int insuranceId, String insuranceName, double insurancePrice, String insuranceType) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insurancePrice = insurancePrice;
		this.insuranceType = insuranceType;

	}
	
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
