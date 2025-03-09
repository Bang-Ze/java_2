package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {
    static ArrayList<String> addProduct = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        menu();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Choose your option: ");
            if (!scanner.hasNextInt()){
                System.out.println("Invalid input! Please try a number.");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1 : {
                    addNewProductByName();
                    break;
                }
                case 2:{
                    searchProductNameByName();
                    break;
                }
                case 3:{
                    updateProductName();
                    break;
                }
                case 4:{
                    deleteProductName();
                    break;
                }
                case 5:{
                    System.out.println("System exits. Goodbye!");
                    System.exit(0);
                }
                default:
                    System.out.print("Error invalid option: Please try again");
            }
        }
    }
    public static void menu(){
        System.out.println("""
                1. Add New Product by name
                2. Search product name by name
                3. Update product name
                4. Delete product name
                5. Exit
                """);
    }
    public static void addNewProductByName(){
        System.out.print("Insert the number of product you want to add: ");
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
            return;
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<n; i++){
            System.out.print("Insert your product: \n" +(i+1)+ ". ");
            String product = scanner.nextLine();
            addProduct.add(product);
        }
        System.out.println("Your products have been added successfully.");
    }
    public static void searchProductNameByName(){
        System.out.print("Insert the product you want to search: ");
        String searchProduct = scanner.nextLine();
        int index = addProduct.indexOf(searchProduct);
        if (index>=0){
            System.out.println("Product found: " + addProduct.get(index));
        } else {
            System.out.println("Product not found.");
        }
    }
    public static void updateProductName(){
        System.out.print("Insert the old product: ");
        String newName = scanner.nextLine();
        int index = addProduct.indexOf(newName);
        if (index >= 0){
            System.out.print("Insert your new product: ");
            String updateName = scanner.nextLine();
            addProduct.set(index, updateName);
            System.out.println("Here is the list 0f your new product: ");
            addProduct.forEach(e-> System.out.println("Product name: " + e));
        } else {
            System.out.println("Product not found.");
        }
    }
    public static void deleteProductName(){
        System.out.print("Insert the product name you want to delete: ");
        String deleteProduct = scanner.nextLine();
        if(addProduct.remove(deleteProduct)){
            System.out.println("The product has been removed successfully");
        } else {
            System.out.println("Product not found.");
        }
    }
}
