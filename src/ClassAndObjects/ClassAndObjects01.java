package ClassAndObjects;

import ClassAndObjects.model.Student;

public class ClassAndObjects01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo(1, "neakKruBingo", "bingo@gmail.com");
        Student student2 = new Student();
        student2.setStudentInfo(2, "zo", "zo@gmail.com");
        student1.getStudentInfo();
        student2.getStudentInfo();
    }
}