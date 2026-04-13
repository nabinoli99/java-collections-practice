import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<String>();
        employees.add("Sandip");
        employees.add("Amrit");
        employees.add("Diwash");
        employees.add("Prakash");
        employees.add("Aditya");
        employees.add("Subash");
        employees.add("Rishab");
        employees.add("meghraj");
        employees.add("jebish");

        System.out.println("Employees before removing: " + employees);

        employees.remove(2); // removing the element at index 2
        System.out.println("Employees after removing: " + employees);

        employees.remove("Prakash"); // removing the element with value "Prakash"
        System.out.println("Employees after removing: " + employees);

        employees.removeFirst(); // removing the first element
        System.out.println("Employees after removing: " + employees);

        employees.removeLast(); // removing the last element
        System.out.println("Employees after removing: " + employees);

        employees.removeFirstOccurrence("Amrit"); // removing the first occurrence of "Amrit"
        System.out.println("Employees after removing: " + employees);

        employees.removeLastOccurrence("Aditya"); // removing the last occurrence of "Aditya"
        System.out.println("Employees after removing: " + employees);

        employees.clear(); // removing all the elements
        System.out.println("Employees after removing: " + employees);

    }

}
