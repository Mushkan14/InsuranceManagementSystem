package com.insurance.main;

import java.util.Scanner;

import com.insurance.lifeinsurance.LifeInsurance;

public class MainMenu {

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Insurance System =====");
            System.out.println("1) Auto Insurance");
            System.out.println("2) Health Insurance");
            System.out.println("3) Life Insurance");
            System.out.println("4) Property Insurance");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   
                //    AutoInsurance.main(null);  
                    break;
                case 2:

                  //  HealthInsurance.main(null);
                    break;
                case 3:
                   
                    LifeInsurance.main(null);
                    break;
                case 4:

                 //   PropertyInsurance.main(null);
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
