import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Correction {
    public static void main(String[] args) {
        // Initialize ArrayList with names
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Nziza", "Angelique", "Bella", "Kamaliza", "Triphine"
        ));

        System.out.println("Students: " + students);

        // Using Set to remove duplicates
        Set<String> uniqueNames = new LinkedHashSet<>(students);
        System.out.println("Unique Students: " + uniqueNames);

        // Sort alphabetically
        Collections.sort(students);
        System.out.println("Sorted Students: " + students);

        // Filter names starting with 'A'
        List<String> aNames = new ArrayList<>();
        for (String name : students) {
            if (name.startsWith("A")) {
                aNames.add(name);
            }
        }
        System.out.println("Names starting with 'A': " + aNames);

        // Reverse the list
        Collections.reverse(students);
        System.out.println("Reversed List: " + students);

        // Access first and last elements
        System.out.println("First Student: " + students.get(0));
        System.out.println("Last Student: " + students.get(students.size() - 1));
    }
}
