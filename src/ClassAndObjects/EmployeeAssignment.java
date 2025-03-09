package ClassAndObjects;

import ClassAndObjects.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeAssignment {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeInfo(1, UUID.randomUUID().toString(), "KruBingo", "CEO", 10000.00);
        Employee employee2 = new Employee();
        employee2.setEmployeeInfo(2, UUID.randomUUID().toString(), "WAHHHH", "CEO", 10000.00);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        // for each
        for (Employee em: employees){
            System.out.println(em);
        }
    }
}
