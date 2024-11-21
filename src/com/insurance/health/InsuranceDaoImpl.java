package com.insurance.health;

//InsuranceDaoImpl.java
import java.util.ArrayList;
import java.util.List;

public class InsuranceDaoImpl implements InsuranceDao {
 private List<Insurance> policies = new ArrayList<>();

 // Constructor to add default policies
 public InsuranceDaoImpl() {
     policies.add(new Insurance(101, "HealthPlus", 500000, 1500));
     policies.add(new Insurance(102, "FamilySafe", 1000000, 3000));
 }

 @Override
 public void addPolicy(Insurance policy) {
     // Check if the policy ID already exists
     for (Insurance existingPolicy : policies) {
         if (existingPolicy.getPolicyId() == policy.getPolicyId()) {
             System.out.println("Error: Policy with ID " + policy.getPolicyId() + " already exists.");
             return;
         }
     }
     // Add the new policy if no duplicates are found
     policies.add(policy);
     System.out.println("Policy added successfully!");
 }

 @Override
 public List<Insurance> viewAllPolicies() {
     return policies;
 }

 @Override
 public boolean deletePolicy(int policyId) {
     return policies.removeIf(policy -> policy.getPolicyId() == policyId);
 }
}
