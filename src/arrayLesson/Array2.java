package arrayLesson;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        System.out.print("Insert number of row: ");
        int numberRow = new Scanner(System.in).nextInt();
        System.out.print("Insert number of column: ");
        int numberColumn = new Scanner(System.in).nextInt();
        String [][] hall = new String[numberRow][numberColumn];
        char characterSeat = 'A';
        int seatCode = 1;
        for(int i=0; i<hall.length; i++){
            seatCode = 1;
            for(int j=0; j<hall[i].length; j++){
                hall[i][j] = characterSeat + "-" + seatCode + " : AV";
                seatCode++;
            }
            characterSeat++;
        }
        for(int i=0; i<hall.length; i++){
            for(int j=0; j<hall[i].length; j++){
                if (j==0){
                    System.out.print("| ");
                }
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println();
        }
        //for booking
        System.out.print("Insert seat code to book (A-1, B-1): ");
        String code = new Scanner(System.in).nextLine();
        code = code.trim();
        // start checking entered seat code
        for(int i=0; i < hall.length; i++){
            for(int j=0; j < hall[i].length; j++){
                String [] splitCode = hall[i][j].split(" : ");
                if(splitCode[0].equalsIgnoreCase(code)){
                    hall[i][j] = splitCode[0] + " : BO";
                }
            }
        }
        // showing hall
        for (int i=0; i < hall.length; i++){
            for(int j=0; j < hall[i].length; j++){
                if (j==0) {
                    System.out.print("| ");
                }
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
