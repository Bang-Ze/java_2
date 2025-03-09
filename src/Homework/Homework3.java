package Homework;

import java.util.*;

public class Homework3 {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> studentInfo = new HashMap<>();
    private static boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(9999);
        studentInfo.put(key, studentName);
        return true;
    }
    private static boolean deleteStudentById(int id){
        String value = studentInfo.remove(id);
        if (value!=null){
            return true;
        }
        return false;
    }
    private static boolean updateStudentById(int id, String newName){
        String value = studentInfo.put(id, newName);
        if (value!=null){
            return true;
        }
        return false;
    }
    private static void home(){
        while (true){
        System.out.println("""
                1. Add student name
                2. Search by ID
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
        System.out.print("Insert your option: ");
        if (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number from 1-5");
            scanner.nextLine();
            continue;
        }
        int option = scanner.nextInt();
        scanner.nextLine();
            switch(option) {
                case 1: {
                    System.out.println("***Student Record***");
                    System.out.print("Insert student name to add to record: ");
                    String name = scanner.nextLine();
                    addNewStudentName(name);
                    System.out.println("Student added. Current records " + studentInfo);
                    break;
                }
                case 2: {
                    System.out.print("Insert the Id you want to search: ");
                    if (!scanner.hasNextInt()) {
                        System.out.print("Invalid number. Please try again.");
                        scanner.nextLine();
                        continue;
                    }
                    int searchID = scanner.nextInt();
                    scanner.nextLine();
                    if (studentInfo.containsKey(searchID)){
                        System.out.println("This name has in the system.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Insert the Id you want to delete: ");
                    int id = scanner.nextInt();
                    if (studentInfo.containsKey(id)) {
                        deleteStudentById(id);
                        System.out.println("Student " + id + " is deleted successfully");
                    } else {
                        System.out.print("Student not found.");
                    }
                    deleteStudentById(id);
                    break;
                }
                case 4: {
                    System.out.print("Insert the Id you want to update: ");
                    if (!scanner.hasNextInt()) {
                        System.out.print("Invalid number. Please try again.");
                        scanner.nextLine();
                        continue;
                    }
                    int id = scanner.nextInt();
                    if(!studentInfo.containsKey(id)){
                        System.out.println("Student not found.");
                    }
                    System.out.print("Insert new name you want to update: ");
                    String newName = scanner.nextLine();
                    scanner.nextLine();
                    studentInfo.put(id, newName);
                    System.out.println("New name has updated successfully.");
                    updateStudentById(id, newName);
                    break;
                }
                case 5: {
                    System.out.println("Thank you for visiting us. Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid input. Please enter a number from 1-5");
                    home();
                    scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}