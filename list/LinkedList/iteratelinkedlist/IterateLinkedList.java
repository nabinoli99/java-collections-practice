import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();

        l1.add("Nabin");
        l1.add("Finley");
        l1.add("Simula");
        l1.add("Enim");
        l1.add("StriveX");

        // Using the Get method and the for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println();

        // Using the for each loop OR Using iterator is recommended practise
        for (String str : l1) {
            System.out.println(str + " ");
        }
    }
}
