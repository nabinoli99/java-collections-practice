import java.util.LinkedList;

public class LinkedListPopMethod {
    public static void main(String[] args)
     {
        LinkedList<String> users = new LinkedList<String>();

        users.add("Finley");
        users.add("Simula");
        users.add("Enim");
        users.add("Rimesh");
        users.add("Dipendra");

        /**
         * In Java, the pop() method of the LinkedList
         * is used to remove and
         * return the top element from the stack represented
         * by the LinkedList
         */

        System.out.println("" + users.pop());
        System.out.println("Users: " + users);
    }

}
