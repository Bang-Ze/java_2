////import java.util.Arrays;
////import java.util.Scanner;
////
//////import java.util.Scanner;
//////
//////public class testing {
//////    public static void main(String[] args) throws InterruptedException{
//////        System.out.println("=".repeat(30));
//////        System.out.println("-".repeat(10) + " Food Panda " + "-".repeat(10));
//////        System.out.println("=".repeat(30));
//////        System.out.println("""
//////                1. View all product
//////                2. View cart
//////                3. Start order
//////                4. View order history
//////                5. Exit :)
//////                """);
//////        System.out.println("-".repeat(30));
//////        System.out.print("Insert your option: ");
//////        int num = new Scanner(System.in).nextInt();
//////        while (true) {
//////            switch (num) {
//////                case 1 -> System.out.println("1. View all product");
//////                case 2 -> System.out.println("2. View cart");
//////                case 3 -> System.out.println("3. Start order");
//////                case 4 -> System.out.println("4. View order history");
//////                case 5 -> {
//////                    System.out.println("%. Exit :)");
//////                    System.exit(0);
//////                }
//////            }
//////            System.out.println("Press any key to continue: ");
//////            new Scanner(System.in).nextLine();
//////        }
//////    }
//////
//////public class testing{
////////    public static void main(String[] args) {
////////    int [] numbers = {-1,-2,-3,3,2,1};
////////        System.out.println(Arrays.toString(numbers));
////////        for(int i=0;i<numbers.length;i++){
////////        for(int j=0;j<numbers.length-1;j++){
////////            if(numbers[j]>numbers[j+1]){
////////                int temp = numbers[j];
////////                numbers[j]= numbers[j+1];
////////                numbers[j+1] = temp;
////////            }
////////        }
////////        }
////////        System.out.println(Arrays.toString(numbers));
////////    }
//////}
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class testing {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> history = new ArrayList<>();
//        System.out.print("[+] Insert number of rows: ");
//        int rowNumber = scanner.nextInt();
//        System.out.print("[+] Insert number of columns: ");
//        int columnNumber = scanner.nextInt();
//
//        String[][] hall = initializeHall(rowNumber, columnNumber);
//
//        while (true) {
//            displayMenu();
//            System.out.print("[+] Choose an option: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    displayHall(hall);
//                    break;
//                case 2:
//                    bookSeat(hall, scanner, history);
//                    break;
//                case 3:
//                    cancelSeat(hall, scanner, history);
//                    break;
//                case 4:
//                    viewHistory(history);
//                    break;
//                case 5:
//                    System.out.println("Exiting program. Goodbye!");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//    private static void displayMenu() {
//        System.out.println("\nMenu:");
//        System.out.println("1. View Seating Arrangement");
//        System.out.println("2. Book a Seat");
//        System.out.println("3. Cancel a Booking");
//        System.out.println("4. View Booking History");
//        System.out.println("5. Exit");
//    }
//    private static String[][] initializeHall(int rows, int cols) {
//        String[][] hall = new String[rows][cols];
//        char characterSeat = 'A';
//
//        for (int i = 0; i < rows; i++) {
//            int seatCode = 1;
//            for (int j = 0; j < cols; j++) {
//                hall[i][j] = characterSeat + "-" + seatCode + " :AV"; // "AV" means Available
//                seatCode++;
//            }
//            characterSeat++;
//        }
//        return hall;
//    }
//    private static void displayHall(String[][] hall) {
//        System.out.println("\nCurrent Seating Arrangement:");
//        for (String[] row : hall) {
//            System.out.print("| ");
//            for (String seat : row) {
//                System.out.print(seat + " | ");
//            }
//            System.out.println();
//        }
//    }
//    private static void bookSeat(String[][] hall, Scanner scanner, List<String> history) {
//        System.out.print("[+] Insert seat code to book (e.g., A-1, B-1): ");
//        String code = scanner.next().trim();
//        boolean isFoundSeat = false;
//
//        for (int i = 0; i < hall.length; i++) {
//            for (int j = 0; j < hall[i].length; j++) {
//                String[] splitCode = hall[i][j].split(":");
//                if (splitCode[0].trim().equalsIgnoreCase(code)) {
//                    isFoundSeat = true;
//                    if (splitCode[1].trim().equalsIgnoreCase("BO")) {
//                        System.out.println("This seat has already been booked 🔥");
//                        return;
//                    }
//                    hall[i][j] = splitCode[0] + ":BO"; // "BO" means Booked
//                    history.add("Booked: " + code);
//                    System.out.println("Seat " + code + " successfully booked!");
//                }
//            }
//        }
//
//        if (!isFoundSeat) {
//            System.out.println("Seat not found. Please try again.");
//        }
//    }
//    private static void cancelSeat(String[][] hall, Scanner scanner, List<String> history) {
//        System.out.print("[+] Insert seat code to cancel (e.g., A-1, B-1): ");
//        String code = scanner.next().trim();
//        boolean isFoundSeat = false;
//
//        for (int i = 0; i < hall.length; i++) {
//            for (int j = 0; j < hall[i].length; j++) {
//                String[] splitCode = hall[i][j].split(":");
//                if (splitCode[0].trim().equalsIgnoreCase(code)) {
//                    isFoundSeat = true;
//                    if (splitCode[1].trim().equalsIgnoreCase("AV")) {
//                        System.out.println("This seat is already available.");
//                        return;
//                    }
//                    hall[i][j] = splitCode[0] + ":AV"; // "AV" means Available
//                    history.add("Cancelled: " + code);
//                    System.out.println("Seat " + code + " has been canceled.");
//                }
//            }
//        }
//
//        if (!isFoundSeat) {
//            System.out.println("Seat not found. Please try again.");
//        }
//    }
//
//    private static void viewHistory(List<String> history) {
//        if (history.isEmpty()) {
//            System.out.println("No booking history available.");
//        } else {
//            System.out.println("\nBooking History:");
//            for (String record : history) {
//                System.out.println(record);
//            }
//        }
//    }
//}

import java.time.LocalDateTime;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRow = getInput(scanner, "Insert number of rows: ");
        int numberColumn = getInput(scanner, "Insert number of columns: ");

        String[][] hall = new String[numberRow][numberColumn];
        String[][] history = new String[numberRow][numberColumn];

        setUpHall(hall);

        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1 -> displayHall(hall);
                case 2 -> bookSeat(scanner, hall, history);
                case 3 -> cancelSeat(scanner, hall, history);
                case 4 -> viewHistory(history);
                case 5 -> {
                    System.out.println("Thank you for using the system. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static int getInput(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                return num;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    private static void setUpHall(String[][] hall) {
        char rowLabel = 'A';
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = rowLabel + "-" + (j + 1) + " : AV"; // AV = Available
            }
            rowLabel++;
        }
    }

    private static void displayHall(String[][] hall) {
        System.out.println("\nCurrent Seating Arrangement:");
        for (String[] row : hall) {
            for (String seat : row) {
                System.out.print(seat + " | ");
            }
            System.out.println();
        }
    }

    private static void bookSeat(Scanner scanner, String[][] hall, String[][] history) {
        System.out.print("Enter seat code to book (e.g., A-1, B-2): ");
        String code = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] seatData = hall[i][j].split(" : ");
                if (seatData[0].equalsIgnoreCase(code)) {
                    if (seatData[1].equals("BO")) {
                        System.out.println("Sorry, this seat is already booked.");
                        return;
                    }
                    hall[i][j] = seatData[0] + " : BO";
                    history[i][j] = "Booked at " + LocalDateTime.now();
                    System.out.println("Seat " + code + " successfully booked!");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Invalid seat code. Please try again.");
        }
        displayHall(hall);
    }

    private static void cancelSeat(Scanner scanner, String[][] hall, String[][] history) {
        System.out.print("Enter seat code to cancel (e.g., A-1, B-2): ");
        String code = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] seatData = hall[i][j].split(" : ");
                if (seatData[0].equalsIgnoreCase(code)) {
                    if (seatData[1].equals("AV")) {
                        System.out.println("This seat is already available.");
                        return;
                    }
                    hall[i][j] = seatData[0] + " : AV";
                    history[i][j] = "Canceled at " + LocalDateTime.now();
                    System.out.println("Booking for seat " + code + " has been canceled.");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Invalid seat code. Please try again.");
        }
        displayHall(hall);
    }

    private static void viewHistory(String[][] history) {
        System.out.println("\nBooking & Cancellation History:");
        boolean hasHistory = false;

        for (String[] row : history) {
            for (String record : row) {
                if (record != null) {
                    System.out.println(record);
                    hasHistory = true;
                }
            }
        }

        if (!hasHistory) {
            System.out.println("No history available.");
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. View Seating Arrangement");
        System.out.println("2. Book a Seat");
        System.out.println("3. Cancel a Booking");
        System.out.println("4. View Booking History");
        System.out.println("5. Exit");
    }
}
