package com.insurance.lifeinsurance;



public class Policy {
    private String policyId;
    private String policyName;
    private double premiumAmount;
    private double sumAssured;

    public Policy(String policyId, String policyName, double premiumAmount, double sumAssured) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.premiumAmount = premiumAmount;
        this.sumAssured = sumAssured;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public double getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(double sumAssured) {
        this.sumAssured = sumAssured;
    }

    @Override
    public String toString() {
        return "Policy ID: " + policyId + ", Name: " + policyName + ", Premium: $" + premiumAmount + " per year, Sum Assured: $" + sumAssured;
    }
}
