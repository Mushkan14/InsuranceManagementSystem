package com.insurance.auto;


import java.util.Scanner;


public class AutoPolicyClient {
	
	public static void main(String[] args) {
	
		PolicyDetail policyDetail= new PolicyDetail();
		
		Scanner scanner=new Scanner(System.in);
		
		
		while (true)
		{
		System.out.println("===================================");
		System.out.println("           1)Login                ");
		System.out.println("");
		System.out.println("           2) Exit                ");
		
		System.out.println("===================================");
		
		System.out.println("Enter the Choice");
		
		int choice= scanner.nextInt();
		switch (choice)
		{
		
		case 1:
			System.out.println("Enter User Name");
			String uname=scanner.next();
			System.out.println("Enter password");
			String pass=scanner.next();
			
			if(uname.equals("admin")&& pass.equals("admin@123"))
			{
				policyDetail.adminPolicyPlan();	
			}
			else {
				System.out.println("Invalid UserName And Password");
			}
			
break;

		case 2:
			
			System.out.println("Thankyou for using this App");
			System.exit(0);
			default:
				System.out.println("choose 1 to 2 between");
			
			
			
			
			
			
		}
		
	}

}
	}


