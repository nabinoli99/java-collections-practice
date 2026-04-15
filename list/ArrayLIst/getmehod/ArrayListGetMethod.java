import java.util.ArrayList;

public class ArrayListGetMethod {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("Sandip");
        users.add("Nabkiran");
        users.add("Prakash");
        users.add("Aditya");
        users.add("Roshan");

        System.out.println("" + users);

        // Getting the element at index 1
        String user = users.get(1);
        System.out.println("User at index 1 is " + user);
    }

}
