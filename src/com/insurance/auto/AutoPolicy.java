package com.insurance.auto;



public class AutoPolicy {
  private int policyId;
  private String policyName;
  private double policyPrice;
  private String planType;

  
public AutoPolicy(int policyId, String policyName, double policyPrice, String planType) {
	super();
	this.policyId = policyId;
	this.policyName = policyName;
	this.policyPrice = policyPrice;
	this.planType = planType;
}

public int getPolicyId() {
	return policyId;
}
public void setPolicyId(int policyId) {
	this.policyId = policyId;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public double getPolicyPrice() {
	return policyPrice;
}
public void setPolicyPrice(double policyPrice) {
	this.policyPrice = policyPrice;
}
public String getPlanType() {
	return planType;
}
public void setPlanType(String planType) {
	this.planType = planType;
}

public AutoPolicy() {
	super();
	// TODO Auto-generated constructor stub
}
  

  
}
