package Constructor;

import java.util.UUID;

class Animal{
    private Integer id;
    private String uuid;
    private String name;
    private String color;
    private String gender;
    //
    public Animal(Integer id, String uuid, String name, String color, String gender) {
        this.id = id;
        this.uuid = (uuid != null) ? uuid : UUID.randomUUID().toString();
        this.name = name;
        this.color = color;
        this.gender = gender;
    }
    public Animal(){
        this.uuid = UUID.randomUUID().toString();
    }
    public void setId(Integer id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setUuid(String uuid){
        this.uuid = (uuid != null) ? uuid : UUID.randomUUID().toString();
    }
    public String getUuid(){
        return this.uuid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    @Override
    public String toString() {
        return "Animal " +
                "id = " + id +
                ", uuid = " + uuid  +
                ", name = " + name  +
                ", color = " + color  +
                ", gender = " + gender;
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println("Value of object 1: " + animal1);
        Animal animal2 = new Animal(1,null,"Dog","Brown","Male");
        System.out.println("Value of object 2: " + animal2);
        Animal animal3 = new Animal();
        animal3.setName("Cat");
        System.out.println("Value of object 3: " + animal3.getName());
        Animal animal4 = new Animal();
        animal4.setUuid("1234");
        System.out.println("Value of object 4: " + animal4.getUuid());
        Animal animal5 = new Animal();
        animal5.setColor("Brown");
        System.out.println("Value of object 5: " + animal5.getColor());
        Animal animal6 = new Animal();
        animal6.setGender("Female");
        System.out.println("Value of object 4: " + animal6.getGender());
    }
}
