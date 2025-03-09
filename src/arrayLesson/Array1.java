package arrayLesson;


import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("=".repeat(35));
        System.out.println("  Product Stock Management system");
        System.out.println("=".repeat(35));
        String [] productName = new String[30];
        while(true){
            System.out.println("""
                    1. List all Product
                    2. Create new Product
                    3. Update Product
                    4. Delete
                    5. Exit
                    """);
            System.out.println("-".repeat(30));
            System.out.print("Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch(opt){
                case 1 ->{
                    System.out.println("List all the product");
                    for(String p: productName){
                        if (p!=null){
                            System.out.println(p);
                        }

                    }
                }
                case 2 ->{
                    System.out.print("Create new product: ");
                    String productN = new Scanner(System.in).nextLine();
                    for(int i=0; i<productName.length;i++){
                        if (productName[i]==null){
                            productName[i] = productN;
                            break;
                        }
                    }
                    System.out.println("Product has been added successfully");
                    System.out.println("Create at " + Date.from(Instant.now()));
                }
                case 3 ->{
                    System.out.print("Insert the old product you want to update: ");
                    String oldProduct = new Scanner(System.in).nextLine();
                    for (int i=0; i<productName.length; i++){
                        if(productName[i]!=null && productName[i].equals(oldProduct)){
                            System.out.print("Insert the product you want to update: ");
                            String newProduct = new Scanner(System.in).nextLine();
                            productName[i] = newProduct;
                        }
                    }
                    System.out.println("Product has been updated successfully");
                    System.out.println("Update at " + Date.from(Instant.now()));
                }
                case 4 ->{
                    System.out.print("Insert any Product name to delete: ");
                    String deleteName = new Scanner(System.in).nextLine();
                    for (int i=0; i<productName.length; i++){
                        if (productName[i]!= null && productName[i].equals(deleteName)){
                            productName[i]=null;
                        }
                    }
                    System.out.println("Product has been remove successfully");
                    System.out.println("Remove at " + Date.from(Instant.now()));
                }
                case 5 ->{
                    System.exit(0);

                }
            }
        }
    }
}
