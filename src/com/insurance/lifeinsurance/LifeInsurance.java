package com.insurance.lifeinsurance;

import java.util.List;
import java.util.Scanner;

public class LifeInsurance {
    private PolicyDao policyDao;

    // Constructor to initialize the policyDao
    public LifeInsurance() {
        this.policyDao = new PolicyDao();
    }

    // List all policies in the system
    public void listPolicies() {
        System.out.println("\nAvailable Life Insurance Policies:");
        List<Policy> policies = policyDao.getAllPolicies();
        if (policies.isEmpty()) {
            System.out.println("No policies available.");
        } else {
            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
    }

    // Add a new policy to the system
    public void addPolicy(String policyId, String policyName, double premiumAmount, double sumAssured) {
        Policy policy = new  Policy(policyId, policyName, premiumAmount, sumAssured);
        policyDao.addPolicy(policy);
        System.out.println("Policy added successfully.");
    }

    // Update an existing policy
    public void updatePolicy(String policyId, String newPolicyName, double newPremiumAmount, double newSumAssured) {
        boolean isUpdated = policyDao.updatePolicy(policyId, newPolicyName, newPremiumAmount, newSumAssured);
        if (isUpdated) {
            System.out.println("Policy updated successfully.");
        } else {
            System.out.println("Policy not found.");
        }
    }

    // Delete a policy from the system
    public void deletePolicy(String policyId) {
        boolean isDeleted = policyDao.deletePolicy(policyId);
        if (isDeleted) {
            System.out.println("Policy deleted successfully.");
        } else {
            System.out.println("Policy not found.");
        }
    }

    // Main menu for interacting with the Life Insurance system
    public void startService() {
        Scanner scanner = new Scanner(System.in);

        // Check if the user is logged in before allowing access
        if (!UserSession.isLoggedIn()) {
            System.out.println("You must be logged in to access the life insurance services.");
            return;
        }

        while (true) {
            System.out.println("\n--- Life Insurance System ---");
            System.out.println("1. View Policies");
            System.out.println("2. Add Policy");
            System.out.println("3. Update Policy");
            System.out.println("4. Delete Policy");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    listPolicies();
                    break;
                case 2:
                    System.out.print("Enter Policy ID: ");
                    String policyId = scanner.nextLine();
                    System.out.print("Enter Policy Name: ");
                    String policyName = scanner.nextLine();
                    System.out.print("Enter Premium Amount: ");
                    double premiumAmount = scanner.nextDouble();
                    System.out.print("Enter Sum Assured: ");
                    double sumAssured = scanner.nextDouble();
                    addPolicy(policyId, policyName, premiumAmount, sumAssured);
                    break;
                case 3:
                    System.out.print("Enter Policy ID to update: ");
                    policyId = scanner.nextLine();
                    System.out.print("Enter New Policy Name: ");
                    String newPolicyName = scanner.nextLine();
                    System.out.print("Enter New Premium Amount: ");
                    double newPremiumAmount = scanner.nextDouble();
                    System.out.print("Enter New Sum Assured: ");
                    double newSumAssured = scanner.nextDouble();
                    updatePolicy(policyId, newPolicyName, newPremiumAmount, newSumAssured);
                    break;
                case 4:
                    System.out.print("Enter Policy ID to delete: ");
                    policyId = scanner.nextLine();
                    deletePolicy(policyId);
                    break;
                case 5:
                    System.out.println("Exiting Life Insurance System...");
                    scanner.close();  // Close the scanner
                    return; // Exit the system and return to the main menu
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Main method to run the LifeInsurance service
    public static void main(String[] args) {
        System.out.println("Logging in...");
        UserSession.login(); // Simulate logging in

        LifeInsurance service = new LifeInsurance();
        service.startService();
        
        