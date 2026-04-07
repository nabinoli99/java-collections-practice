import java.util.*;

public class ArrayListaddall {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("C++");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Python");
        l2.add("C");

        l1.addAll(l2);

        System.out.println("" + l1);
    }
}