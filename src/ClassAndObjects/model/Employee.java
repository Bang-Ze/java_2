package ClassAndObjects.model;


public class Employee {
    private Integer id;
    private String uuid;
    private String name;
    private String position;
    private Double salary;

    @Override
    public String toString() {
        return "Employee: " +
                "\n id = " + id +
                "\n uuid = " + uuid +
                "\n name = " + name +
                "\n position = " + position +
                "\n salary = " + salary ;
    }

    public void setEmployeeInfo(Integer id,
                            String eUuid,
                            String name,
                            String position,
                            Double salary) {
        this.id = id;
        this.uuid = eUuid;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
