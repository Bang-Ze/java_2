package OOP.Inheritance;

class Person{
    Integer id;
    String email;
    String name;
}
class Teacher extends Person{ }
class Student extends Person{
    String studentCardNumber;
}
public class Inheritance1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.id = 23;
        Student student1 = new Student();
        student1.name = "Kele";
        Student student2 = new Student();
        student2.email = "kele@gmail.com";
        Student student3 = new Student();
        student3.studentCardNumber = "118";
        System.out.println(teacher1.id);
        System.out.println(student1.name);
        System.out.println(student2.email);
        System.out.println(student3.studentCardNumber);
    }
}
