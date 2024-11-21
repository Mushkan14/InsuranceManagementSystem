package com.insurance.health;

import java.util.List;

public interface InsuranceDao {
    void addPolicy(Insurance policy);
    List<Insurance> viewAllPolicies();
    boolean deletePolicy(int policyId);
}
