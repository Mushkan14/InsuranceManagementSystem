package com.insurance.health;

import java.util.Scanner;
import com.insurance.main.MainMenu; 

public class LoginClient {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        
        String correctUsername = "admin"; 
        String correctPassword = "password123"; 
        
        System.out.println("===== Welcome to the Insurance Management System =====");
        
        
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

       
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
            
           
            MainMenu.displayMenu(); // Navigates to the main menu for insurance options

        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
