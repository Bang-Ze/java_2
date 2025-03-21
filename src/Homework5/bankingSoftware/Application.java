package Homework5.bankingSoftware;

import Homework5.model.Account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Login to your account");
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        name = "Chou";
        if (false){
            System.out.println("Incorrect username. Please try again");
            return;
        } else {
            System.out.println("Correct! Please enter the password: ");
            int password = new Scanner(System.in).nextInt();
            password = 123;
            if (false){
                System.out.println("Incorrect password. Please try again");
            } else {
                System.out.println("Correct. Welcome to our bank!");
            }
        }
        Account savingAccount = new Account("Saving");
        savingAccount.deposit(10.1);
        savingAccount.showBalance();
        Account creditCardAccount  = new Account("CreditCard");
        creditCardAccount.showBalance();
    }
}
