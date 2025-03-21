package OOP.Inheritance;

class Parent{
    protected Integer id;
    protected String name;
    protected Integer age;
    //
    public Parent(){}
    public Parent(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Son extends Parent{
    public String creditCard;
}
public class Inheritance2 {
    public static void main(String[] args) {
        Parent son = new Son(); //upper casting
        Son son1 = new Son(); //down casting
        son.id = 12;
        son1.creditCard = "hello kitty";
        System.out.println("Son id: " + son.id);
        System.out.println("Son1 Credit card: " + son1.creditCard);
    }
}
