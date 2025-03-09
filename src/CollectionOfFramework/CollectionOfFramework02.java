package CollectionOfFramework;

import java.util.*;

public class CollectionOfFramework02 {
    private static Map<Integer, String> studentInfo = new HashMap<>();
    private static boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(999999);
        studentInfo.put(key, studentName);
        return true;
    }
    private static boolean removeStudentById(int id){
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
    // homework 2-3-4
    private static void home(){
        System.out.println("""
                1. Add student name
                2. Search by ID
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
        System.out.print("Insert your option: ");
        switch(new Scanner(System.in).nextInt()){
            case 1 :{
                System.out.println(" Student Record ");
                System.out.print("Insert student name to add to record: ");
                String name = new Scanner(System.in).nextLine();
                boolean isInserted = addNewStudentName(name);
                System.out.println(studentInfo);
                break;
            }
            case 2 : {break;}
            case 3 : {break;}
            case 4 : {break;}
            case 5 : {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}