import java.util.ArrayList;

public class ArrayListclear {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("Amrit");
        student.add("Aditya");
        student.add("Diwash");
        student.add("Prakash");
        student.add("Sandeep");

        System.out.println("Before clearing the list: " + student);
        student.clear();
        System.out.println("After clearing the list: " + student);
    }
}