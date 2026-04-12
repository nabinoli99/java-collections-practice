import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate

        System.out.println(set);
    }
}