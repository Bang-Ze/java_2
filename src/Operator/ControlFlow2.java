package Operator;
public class ControlFlow2 {
    public static void main(String[] args) throws InterruptedException {
       myLabel:
        for (int k = 1; k < 10; k++){
            for(int i = 1; i < 10; i++){
                if (i % 2 == 0){
                    break myLabel;
                }
                System.out.println(k + " => " + i);
            }
        }
    }
}
