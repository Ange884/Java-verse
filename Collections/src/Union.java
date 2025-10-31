import java.util.*;

public class Union {
    public static void main(String[] args) {
        // Create two sets of numbers
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Find union
        Set<Integer> union = new HashSet<>(set1); // copy of set1
        union.addAll(set2); // add all elements from set2
        System.out.println("Union: " + union);

        // Find intersection
        Set<Integer> intersection = new HashSet<>(set1); // copy of set1
        intersection.retainAll(set2); // keep only common elements
        System.out.println("Intersection: " + intersection);
    }
}
