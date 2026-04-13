import java.util.LinkedList;

public class updatelinkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Fig");

        System.out.println("Original list: " + list);

        list.set(2, "Blueberry");

        System.out.println("Updated list: " + list);
    }
}
