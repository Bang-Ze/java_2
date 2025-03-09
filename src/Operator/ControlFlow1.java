package Operator;

import java.util.Scanner;

public class ControlFlow1 {
    public static void main(String[] args) throws InterruptedException{
        while (true) {
            System.out.println("=".repeat(6) + " Welcome to my Mart " + "=".repeat(6));
            System.out.println("List all products");
            System.out.println("Add new products");
            System.out.println("Search Products by code");
            System.out.println("Delete Product");
            System.out.println("=".repeat(30));
            Scanner Scanner = new Scanner(System.in);
            int num = Scanner.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("List all Products");
                    break;
                }
                case 2: {
                    System.out.print("Add new Products");
                    break;
                }
                case 3: {
                    System.out.print("Search Products by code");
                    break;
                }
                case 4: {
                    System.out.println("Delete Product.");
                    break;
                }
                default: {
                    System.exit(0);
                }
            }
            System.out.println("Press any key to continue: ");
            new Scanner(System.in).nextLine();
        }
    }
}