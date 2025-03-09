package Variable; /****
 * <h1>User Class<h1/>
 * <p>This class is used for creating user object.</p>
 * <img width="1000" height="1000" src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtlSPH-34KFRaKOv-syHy0BL0rQPgFTAWwfA&s"/>
 * @author = ZE
 * @version = 2.0
 */

import java.util.Scanner;

public class variableLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Math score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Insert Khmer score: ");
        double khmerScore = scanner.nextDouble();
        System.out.print("Insert English score: ");
        double englishScore = scanner.nextDouble();
        System.out.print("Insert Physic score: ");
        double physicScore = scanner.nextDouble();
        double result = mathScore+khmerScore+englishScore+physicScore;
        double avg = (mathScore+khmerScore+englishScore+physicScore)/4;
        System.out.println("Your total score is: " + result);
        System.out.println("Your average score is: " + avg);
        if (avg>=90){
            System.out.println("Grade A");
        } else if (avg>=80) {
            System.out.println("Grade B");
        } else if (avg>=70) {
            System.out.println("Grade C");
        } else if (avg>=60) {
            System.out.println("Grade D");
        } else if (avg>=50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Rean mdg tt tv");
            System.out.println("Click on this link to pass the exam. =) ");
            System.out.println("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtlSPH-34KFRaKOv-syHy0BL0rQPgFTAWwfA&s");
        }
    }
}