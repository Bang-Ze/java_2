package ClassAndObjects.model;

public class Student {
    private Integer id;
    private String name;
    private String email;

    //protected : can use only in this file
    public void setStudentInfo(Integer studentId, String studentName, String studentEmail) {
        id = studentId;
        name = studentName;
        email = studentEmail;
    }

    public void getStudentInfo() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
        System.out.println("\n");
    }
}
