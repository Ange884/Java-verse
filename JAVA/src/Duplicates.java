import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 10, 20, 457, 2049,2,3,4, 1 , 3, 2, 5,457
        ));

        Set<Integer> seen = new HashSet<>();
        Set<Integer> unduplicated = new HashSet<>(numbers);
        System.out.println("removed duplicates"+ unduplicated);
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num : numbers) {
            if (!seen.add(num)) {
                  duplicates.add(num);
            }
        }
        System.out.println("Duplicated numbers" + duplicates);
    }
}
