package com.insurance.property;



import java.util.List;

import com.ims.model.Insurance;

public interface InsuranceDao {

	void addInsurance();
	List <Insurance> viewAllInsurances();
	Insurance viewInsurnace(int iid);
	int updateInsurance(int iid);
	boolean deleteInsurance(int iid);
}
