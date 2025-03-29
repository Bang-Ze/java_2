package Homework5.bankingSoftware;

import Homework5.model.Account;
import Homework5.model.loginAccount;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean loginSuccessful = loginAccount.loginUser();
        if (!loginSuccessful) {
            System.out.println("Login failed. Exiting application.");
            return;
        }
        Account savingAccount = new Account("Saving");
        while (true) {
            System.out.println("""
                1. Deposit
                2. Withdraw
                3. Show Balance
                4. Exchange currency
                5. Exit
                """);
            System.out.println("Please select any option you want to perform: ");
            Integer option = new Scanner(System.in).nextInt();
            switch (option){
                case 1 : {
                    System.out.println("How much do you want to deposit?");
                    double depositMoney = new Scanner(System.in).nextDouble();
                    savingAccount.deposit(depositMoney);
                    savingAccount.showBalance();
                    break;
                }
                case 2 : {
                    System.out.println("How much do you want to deposit?");
                    double withdrawnMoney = new Scanner(System.in).nextDouble();
                    savingAccount.withdraw(withdrawnMoney);
                    savingAccount.showBalance();
                    break;
                }
                case 3 : {
                    savingAccount.showBalance();
                    break;
                }
                case 4 : {
                    System.out.println("""
                        Choose the currency that you want to convert to:
                        1. Convert riel to dollar 
                        2. Convert dollar to riel
                        """);
                    Integer option2 = new Scanner(System.in).nextInt();
                    while (true){
                        switch (option2){
                            case 1 : {
                                System.out.print("Enter the amount of money you want to convert: ");
                                double rielAmount = new Scanner(System.in).nextDouble();
                                savingAccount.convertFromRielToDollar(rielAmount);
                                break;
                            }
                            case 2 : {
                                System.out.println("Enter the amount of money you want to convert: ");
                                double dollarAmount = new Scanner(System.in).nextDouble();
                                savingAccount.convertFromDollarToRiel(dollarAmount);
                                break;
                            }
                            default :
                                System.out.println("Invalid option.");
                                return;
                        }
                    }
                }
                case 5 : {
                    System.out.println("Thank you for visiting us.");
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid option.");
                    return;
            }
        }
    }
}