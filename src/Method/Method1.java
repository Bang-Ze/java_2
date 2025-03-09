package Method;

public class Method1 {
    private static int sum(int a, int b){
        return a+b;
    }
    private static double sum(double a, double b){
        return a+b;
    }
    private static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
       sum(12,24);
        System.out.println(sum(12,24));;
       sum(12.4,125.3);
        System.out.println(sum(12.4,125.3));
       float a = 3214.5f, b = 424.6543f;
       sum(a,b);
        System.out.println(sum(a,b));
    }
}

