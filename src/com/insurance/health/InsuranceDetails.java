package com.insurance.health;

import java.util.List;
import java.util.Scanner;

public class InsuranceDetails {
    private Scanner sc = new Scanner(System.in);
    private InsuranceDao dao = new InsuranceDaoImpl();

    public void adminMenu() {
        System.out.println("\n===== Health Care Insurance System =====");
        while (true) {
            System.out.println("\n===== Admin Menu =====");
            System.out.println("1) View All Policies");
            System.out.println("2) Exit");
            System.out.println("3) Add New Policy");
            System.out.println("4) Delete Policy");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewAllPolicies();
                    break;
                case 2:
                    System.out.println("Thank you for using the Health Insurance System!");
                    sc.close();  // Close the scanner
                    System.exit(0);  // Exit the program
                    break;
                case 3:
                    addPolicy();
                    break;
                case 4:
                    deletePolicy();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // View all policies
    private void viewAllPolicies() {
        List<Insurance> policies = dao.viewAllPolicies();
        System.out.println("\nAvailable Insurance Policies:");
        for (Insurance policy : policies) {
            System.out.println(policy);
        }
    }

    // Add a new policy
    private void addPolicy() {
        System.out.print("Enter Policy ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Policy Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Coverage Amount: ");
        int coverage = sc.nextInt();
        System.out.print("Enter Premium Amount: ");
        int premium = sc.nextInt();

        dao.addPolicy(new Insurance(id, name, coverage, premium));
    }

    // Delete a policy
    private void deletePolicy() {
        System.out.print("Enter Policy ID to delete: ");
        int id = sc.nextInt();
        if (dao.deletePolicy(id)) {
            System.out.println("Policy deleted successfully!");
        } else {
            System.out.println("Policy ID not found.");
        }
    }
}

