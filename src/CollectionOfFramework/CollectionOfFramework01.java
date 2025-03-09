package CollectionOfFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionOfFramework01 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Insert number of name: ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Insert name " + (i+1) + ": ");
            String name = new Scanner(System.in).nextLine();
            //add name to arrayList
            names.add(name);
        }
        names.forEach(e-> System.out.println("Name: " + e));
        System.out.print("Insert old name to update: ");
        String name = new Scanner(System.in).nextLine();
        int index = names.indexOf(name);
        if(index>=0){
            System.out.print("Insert your new name: ");
            String newName = new Scanner(System.in).nextLine();
            //update
            names.set(index, newName);
            names.forEach(e-> System.out.println("Name: " + e));
        } else {
            System.out.println("Name not found.");
        }
    }
}
        //boolean removeName = false;
//        System.out.print("Insert name to delete: ");
//        String rName = new Scanner(System.in).nextLine();
//        int newIndex = name.indexOf(name); // find index of element
//        if(newIndex>=0){
//            names.remove(newIndex); // remove by index
//            System.out.println("Remove name " + rName + " successfully.");
//            names.forEach(System.out::println);
//        }
//        if(!removeName){
//            System.out.println("Name not found.");
//        }