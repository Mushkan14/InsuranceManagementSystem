package com.insurance.auto;

import com.ims.client.AutoPolicyClient;
import com.ims.dao.impl.AutoPolicyDaoImpl;
import com.ims.model.AutoPolicy;

import java.util.Scanner;
import java.util.List;


public class PolicyDetails {

	Scanner scanner=new Scanner(System.in);
	AutoPolicyDaoImpl daoImpl=new AutoPolicyDaoImpl();
	
	public void adminPolicyPlan() 
	{
		while(true) {
			
		
		System.out.println("=======================================");
		System.out.println("           1)AddAutoPolicy               ");
		System.out.println("           2)ViewAllAutoPolicy             ");
		System.out.println("           3)ViewAutoPolicy                         ");
		System.out.println("           4)DeleteAutoPolicy                       ");
		System.out.println("           5)UpdateAutoPolicy                           ");
		System.out.println("           6)Back                         ");
		
		System.out.println("=======================================");
		System.out.println("Enter the Choice");
		int choice=scanner.nextInt();
		switch(choice)
		{
		
		case 1:
			daoImpl.addPolicy();
			adminPolicyPlan();
			break;
			
		case 2:
		List<AutoPolicy>viewAllAutoPolicy =daoImpl.viewAllPolicy();
		
		for(AutoPolicy autopolicy : viewAllAutoPolicy)
		{
			System.out.println(autopolicy.getPolicyId()+"\t"+ autopolicy.getPolicyName()+"\t"+autopolicy.getPolicyPrice()+"\t"+autopolicy.getPlanType());
			
		}
		adminPolicyPlan();
		    break;
		case 3:
			System.out.println("Enter the AutoPolicy Id");
			AutoPolicy viewAutoPolicy = daoImpl.viewPolicy(scanner.nextInt());
			if (viewAutoPolicy!=null)
				System.out.println(viewAutoPolicy.getPolicyId()+"\t"+ viewAutoPolicy.getPolicyName()+"\t"+viewAutoPolicy.getPolicyPrice()+"\t"+viewAutoPolicy.getPlanType());
			
			else 
				System.out.println("Auto Policy Id does not Exist");
			adminPolicyPlan();
			break;
			
		case 4:
			System.out.println("Enter the AutoPolicy Id");
			boolean deleteAutoPolicy = daoImpl.deletePolicy(scanner.nextInt());
			if (deleteAutoPolicy)
				System.out.println("AutoPolicy deleted Successfully");
			else 
				System.out.println("AutoPolicy does not Exits");
			adminPolicyPlan();
			break;
			
		case 5:
			System.out.println("Enter the AutoPolicy Id");
			int updateAutoPolicy = daoImpl.updatePolicy(scanner.nextInt());
			
			if(updateAutoPolicy!=0)
				System.out.println("Auto Policy Updated Successfully");
			else 
				System.out.println("Auto Policy Id does not exist");
			adminPolicyPlan();
			break;
			
		case 6:
			
			AutoPolicyClient.main(null);
			
			break;
		default:
			System.out.println("Choosde 1 to 6 between");
		
			
			
			
			
			
			
			
		}//end of switch
	}
	}
	
	public void userPolicy()
	{
		while(true)
		{
    System.out.println("=======================================");
	System.out.println("           1)ViewAllAutoPolicy                         ");
	System.out.println("           2)ViewAutoPolicy                       ");
	System.out.println("           3)BuyAutoPolicy                           ");
	System.out.println("           4)Back                         ");
	
	System.out.println("=======================================");
   
	System.out.println("Enter the choice");
	int choice=scanner.nextInt();
    switch(choice)
    {
    case 1:
List<AutoPolicy>viewAllAutoPolicy =daoImpl.viewAllPolicy();
		
		for(AutoPolicy autopolicy : viewAllAutoPolicy)
		{
			System.out.println(autopolicy.getPolicyId()+"\t"+ autopolicy.getPolicyName()+"\t"+autopolicy.getPolicyPrice()+"\t"+autopolicy.getPlanType());
			
		}
		userPolicy();
break;

    case 2:
    	System.out.println("Enter the AutoPolicy Id");
		AutoPolicy viewAutoPolicy = daoImpl.viewPolicy(scanner.nextInt());
		if (viewAutoPolicy!=null)
			System.out.println(viewAutoPolicy.getPolicyId()+"\t"+ viewAutoPolicy.getPolicyName()+"\t"+viewAutoPolicy.getPolicyPrice()+"\t"+viewAutoPolicy.getPlanType());
		
		else 
			System.out.println("Auto Policy Id does not Exist");
		userPolicy();
		break;
		
    case 3:
List<AutoPolicy>viewAllAutoPolicys =daoImpl.viewAllPolicy();
		
		for(AutoPolicy autopolicy : viewAllAutoPolicys)
		{
			System.out.println(autopolicy.getPolicyId()+"\t"+ autopolicy.getPolicyName()+"\t"+autopolicy.getPolicyPrice()+"\t"+autopolicy.getPlanType());
			
		}
		System.out.println("Enter which policy would you like to buy");
		int id=scanner.nextInt();
		
		for (AutoPolicy autopolicy1 : viewAllAutoPolicys)
		{
			if (autopolicy1.getPolicyId()==id)
			{viewAllAutoPolicys.remove(autopolicy1);
			System.out.println("Auto Policy Successfully Purchased");
		}
    	
    }
		userPolicy();
		break;
		
    case 4:
    AutoPolicyClient.main(null);
	
	break;
default:
	System.out.println("Choosde 1 to 4 between");

    }
}
}
}
