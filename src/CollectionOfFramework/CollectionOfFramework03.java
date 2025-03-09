package CollectionOfFramework;

class Math{
    private int sum;
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int...numbers){
        for(int n:numbers){
            sum = sum +n;
        }
        return sum;
    }
}

public class CollectionOfFramework03 {
    public static void main(String[] args) {
       Math math = new Math();
       int resultOfSum = math.sum(1,2,3,4,31,34);
        System.out.println("Result of sum: " + resultOfSum);
    }
}