package OOP.Inheritance;

class parent{
    protected String name;
    protected String age;
    //
    public parent(){}
    public parent(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
class son extends parent{
    public son(String name){
        super(name);
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        parent son = new son("Nezha");
        son.run();
    }
}
