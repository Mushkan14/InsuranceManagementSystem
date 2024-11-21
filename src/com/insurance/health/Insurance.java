package com.insurance.health;
public class Insurance {
    private int policyId;
    private String policyName;
    private int coverage;
    private int premium;

    public Insurance(int policyId, String policyName, int coverage, int premium) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.coverage = coverage;
        this.premium = premium;
    }

    public int getPolicyId() {
        return policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public int getCoverage() {
        return coverage;
    }

    public int getPremium() {
        return premium;
    }

    @Override
    public String toString() {
        return "ID: " + policyId + ", Name: " + policyName + ", Coverage: " + coverage + ", Premium: " + premium;
    }
}
