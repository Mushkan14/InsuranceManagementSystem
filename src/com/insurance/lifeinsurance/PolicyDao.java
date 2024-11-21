package com.insurance.lifeinsurance;

import java.util.List;
import java.util.ArrayList;

public class PolicyDao {
    private List<Policy> policies;

    public PolicyDao() {
        this.policies = new ArrayList<>();
        this.policies.add(new Policy("P01", "Basic Life Plan", 1000.0, 10000.0));
        this.policies.add(new Policy("P02", "Premium Life Plan", 100000.0, 1000000.0));
    }

    public void addPolicy(Policy policy) {
        policies.add(policy);
    }

    public boolean updatePolicy(String policyId, String newPolicyName, double newPremiumAmount, double newSumAssured) {
        for (Policy policy : policies) {
            if (policy.getPolicyId().equals(policyId)) {
                policy.setPolicyName(newPolicyName);
                policy.setPremiumAmount(newPremiumAmount);
                policy.setSumAssured(newSumAssured);
                return true;
            }
        }
        return false;
    }

    public boolean deletePolicy(String policyId) {
        return policies.removeIf(policy -> policy.getPolicyId().equals(policyId));
    }

    public List<Policy> getAllPolicies() {
        return new ArrayList<>(policies);
    }

    public Policy getPolicyById(String policyId) {
        for (Policy policy : policies) {
            if (policy.getPolicyId().equals(policyId)) {
                return policy;
            }
        }
        return null;
    }
}
