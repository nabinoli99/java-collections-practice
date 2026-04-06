import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);

        System.out.println("Numbers in ArrayList are: \n" + numbers);

    }
}