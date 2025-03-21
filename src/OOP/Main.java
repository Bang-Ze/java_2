package OOP;

import OOP.Model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(23);
        System.out.println("User ID: " + user.getId());
        System.out.println("YAY");
    }
}
