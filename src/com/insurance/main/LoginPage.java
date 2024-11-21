package com.insurance.main;
import java.util.Scanner;

public class LoginPage {
    public static boolean authenticate(String username, String password) {
       
        return username.equals("admin") && password.equals("admin123");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        if (authenticate(username, password)) {
            System.out.println("Login successful!");
           
            MainMenu.displayMenu();
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        scanner.close();
    }
}
