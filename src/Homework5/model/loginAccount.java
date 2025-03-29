package Homework5.model;

import java.util.Scanner;

public class loginAccount {
    public static boolean loginUser(){
        String correctUsername = "Chou";
        int correctPassword = 123;
        String name;
        int password;
        while (true) {
            System.out.print("Enter your name: ");
            name = new Scanner(System.in).nextLine();
            if (name.equals(correctUsername)) {
                break;
            }
            System.out.println("Incorrect username. Please try again.");
        }
        while (true) {
            System.out.print("Enter your password: ");
            password = new Scanner(System.in).nextInt();
            if (password == correctPassword) {
                break;
            }
            System.out.println("Incorrect password. Please try again.");
        }
        System.out.println("Login successful! Welcome to our bank.");
        return true;
    }
}