package com.insurance.auto;

import java.util.List;


public interface AutoPolicyDao {
void addPolicy();
List<AutoPolicy>viewAllPolicy();
AutoPolicy viewPolicy(int pid);
boolean deletePolicy(int pid);
int updatePolicy(int pid);

}