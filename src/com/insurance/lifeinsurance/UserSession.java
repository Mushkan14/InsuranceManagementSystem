package com.insurance.lifeinsurance;

public class UserSession {
    private static boolean isLoggedIn = false;

    public static boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void login() {
        isLoggedIn = true;
    }

    public static void logout() {
        isLoggedIn = false;
    }
}

