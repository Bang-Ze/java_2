package Homework;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberRow = getRowAndColumn(scanner,"Insert number of row: ");
        int numberColumn = getRowAndColumn(scanner,"Insert number of column: ");
        String [][] hall = new String[numberRow][numberColumn];
        StringBuilder [][] bookHistory = new StringBuilder[numberRow][numberColumn];
        StringBuilder [][] cancelHistory = new StringBuilder[numberRow][numberColumn];
        initializeHistory(bookHistory, cancelHistory);
        while(true){
            displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch(option){
                case 1 : {
                    System.out.println("Here is the seat view.");
                    setUpHall(hall);
                    displaysSetUpHall(hall);
                    break;
                }
                case 2 : {
                    startBooking(scanner, hall, bookHistory);
                    break;
                }
                case 3 : {
                    cancelBookedSeat(scanner, hall, cancelHistory);
                    break;
                }
                case 4 : {
                    viewHistory(bookHistory, cancelHistory);
                    break;
                }
                case 5 : {
                    System.out.print("Thank you for visiting.");
                    System.exit(0);
                }
                default :
                    System.out.println("Error. Please try again.");
            }
        }
    }
    public static void displayMenu(){
        System.out.println("""
                List option as below
                1. Set up hall
                2. Start booking
                3. Cancel booked seat
                4. View History
                5. Exit
                """);
    }
    public static int getRowAndColumn (Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                return num;
            } else {
                System.out.println("Error. Please try again!");
                scanner.next();
            }
        }
    }
    public static void initializeHistory(StringBuilder[][] bookHistory, StringBuilder[][] cancelHistory) {
        for (int i = 0; i < bookHistory.length; i++) {
            for (int j = 0; j < bookHistory[i].length; j++) {
                bookHistory[i][j] = new StringBuilder();
                cancelHistory[i][j] = new StringBuilder();
            }
        }
    }
    public static void setUpHall(String[][] hall) {
        char characterSeat = 'A';
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (hall[i][j] == null || hall[i][j].endsWith(": AV")) {
                    hall[i][j] = characterSeat + "-" + (j + 1) + " : AV";
                }
            }
            characterSeat++;
        }
    }
    public static void displaysSetUpHall(String [][] hall) {
        for (String[] row : hall) {
            for (String seat : row) {
                System.out.print("| " + seat + " ");
            }
            System.out.println("|");
        }
    }
    public static void startBooking(Scanner scanner, String [][] hall, StringBuilder[][] bookHistory){
        System.out.print("Insert seat code to book (A-1, B-1): ");
        String code = new Scanner(System.in).nextLine();
        code = code.trim();
        boolean found = false;
            for(int i=0; i < hall.length; i++){
            for(int j=0; j < hall[i].length; j++){
                String [] splitCode = hall[i][j].split(" : ");
                if(splitCode[0].equalsIgnoreCase(code)){
                    if (splitCode[1].equalsIgnoreCase("BO")){
                        System.out.println("The seat was already booked.");
                        return;
                    } else {
                        hall[i][j] = splitCode[0] + " : BO";
                        bookHistory[i][j].append("Booked on ").append(LocalDateTime.now()).append("\n");
                        System.out.println("Your booking is confirmed. ");
                        LocalDateTime date = LocalDateTime.now();
                        System.out.println("The seat was booked at: " + date);
                        System.out.println("Your seat is: " + code);
                        System.out.println("After booking: " + hall[i][j]);
                    }
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Unavailable code. Please try again. ");
        }
        displaysSetUpHall(hall);
    }
    public static void cancelBookedSeat(Scanner scanner, String [][] hall, StringBuilder[][] cancelHistory){
        System.out.print("Insert seat code to cancel (A-1, B-1): ");
        String code = new Scanner(System.in).nextLine();
        code = code.trim();
        boolean found = false;
        for(int i=0; i < hall.length; i++){
            for(int j=0; j < hall[i].length; j++){
                String [] splitCode = hall[i][j].split(" : ");
                if(splitCode[0].equalsIgnoreCase(code)){
                    if (splitCode[1].equalsIgnoreCase("AV")){
                        System.out.println("The seat is available.");
                        return;
                    } else {
                        hall[i][j] = splitCode[0] + " : AV";
                        cancelHistory[i][j].append("Canceled on ").append(LocalDateTime.now()).append("\n");
                        System.out.println("Your canceling is confirmed. ");
                        LocalDateTime date = LocalDateTime.now();
                        System.out.println("The seat was cancel at: " + date);
                        System.out.println("Your seat is: " + code);
                        System.out.println("After cancel: " + hall[i][j]);
                    }
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Unavailable code. Please try again. ");
        }
        displaysSetUpHall(hall);
    }
    public static void viewHistory(StringBuilder[][] bookHistory, StringBuilder[][] cancelHistory) {
        boolean hasHistory = false;
        System.out.println("Booked & Canceled History");
        for (int i = 0; i < bookHistory.length; i++) {
            for (int j = 0; j < bookHistory[i].length; j++) {
                String seat = (char) ('A' + i) + "-" + (j + 1);
                if (bookHistory[i][j].length() > 0 || cancelHistory[i][j].length() > 0) {
                    System.out.println("\nSeat: " + seat);
                    if (bookHistory[i][j].length() > 0) {
                        System.out.println(bookHistory[i][j]);
                    } else {
                        System.out.println("No booked history.");
                    }
                    if (cancelHistory[i][j].length() > 0) {
                        System.out.println(cancelHistory[i][j]);
                    } else {
                        System.out.println("No canceled history.");
                    }
                    hasHistory = true;
                }
            }
        }
        if (!hasHistory) {
            System.out.println("No booked or canceled history available.");
        }
    }
}