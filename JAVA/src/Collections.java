import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Mango");    // [Mango]
        fruits.add("Banana");   // [Mango → Banana]
        fruits.add("Apple");    // [Mango → Banana → Apple]
        fruits.add("Orange");   // [Mango → Banana → Apple → Orange]

        System.out.println("LinkedList: " + fruits);

        // Add element at a specific index
        fruits.add(2, "Kiwi");
        System.out.println("After adding Kiwi at index 2: " + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Access first and last elements
        System.out.println("First element: " + ((LinkedList<String>)fruits).getFirst());
        System.out.println("Last element: " + ((LinkedList<String>)fruits).getLast());
    }
}
