package com.insurance.auto;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class AutoPolicyDaoImpl implements AutoPolicyDao {
	
    List<AutoPolicy>addAutoPolicy=new ArrayList();
    
    
	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		
		int k=1;
		while(k==1)
		{
			Scanner scanner=new Scanner(System.in);
		
     
     System.out.println("Enter the AutoPolicy Id");
     int pid=scanner.nextInt();
     System.out.println("Enter the AutoPolicy Name");
     String pname=scanner.next();
     System.out.println("Enter the AutoPolicy Price");
     double pprice=scanner.nextDouble();
     System.out.println("Enter the Autopolicy Type");
     String ptype=scanner.next();
     AutoPolicy autopolicy = new AutoPolicy(pid,pname,pprice,ptype );
     addAutoPolicy.add(autopolicy);
     System.out.println("Policy added successfully");
     System.out.println("Do you want to add more policy 1)Yes 2)No");
     
     k=scanner.nextInt();
     
		}
	}

	@Override
	public List<AutoPolicy> viewAllPolicy() {
		// TODO Auto-generated method stub
		return addAutoPolicy;
	}

	@Override
	public AutoPolicy viewPolicy(int pid) {
		// TODO Auto-generated method stub
    for (AutoPolicy autoPolicy : addAutoPolicy) 
    {
			
			if(autoPolicy.getPolicyId()==pid) 
				
			return autoPolicy ;
		}
		return null;
	}

	@Override
	public boolean deletePolicy(int pid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(AutoPolicy autoPolicy : addAutoPolicy)
		{
			if (autoPolicy.getPolicyId()==pid)
{     
	      addAutoPolicy.remove(autoPolicy);
	      flag=true;
}
		}
		return false;
	}

	@Override
	public int updatePolicy(int pid) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}

