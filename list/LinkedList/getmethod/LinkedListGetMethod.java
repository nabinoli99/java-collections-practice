import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListGetMethod {
    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<String>();

        users.add("Finley");
        users.add("Simula");
        users.add("Enim");
        users.add("Rimesh");
        users.add("Dipendra");

        System.out.println("Users: " + users);

        String user = users.get(1);
        System.out.println("User at index 1 is " + user);
    }
}
