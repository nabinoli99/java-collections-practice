import java.util.ArrayList;

public class ArryaListcontains {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Grapes");
        fruits.add("Papaya");

        System.out.println(fruits.contains("Watermelon"));
        System.out.println(fruits.contains("Peach"));
        System.out.println(fruits.size());

        // contains -> checks the passed element is available in the list or not
        // if available -> returns true
        // if not available -> returns false

        // size -> returns the number of elements in the list
    }
}
