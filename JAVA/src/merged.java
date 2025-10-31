import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merged{
    public static void main(String[] args) {
        // Initialize ArrayList with names
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Nziza", "Angelique", "Bella", "Kamaliza", "Triphine"
        ));

        ArrayList<String> dawgs = new ArrayList<>(Arrays.asList(
                "Nziza", "Hozo", "Mutako", "Atone"
        ));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(
                1,2,3,4
          ));

          List<Object> merged = new ArrayList<>();
          merged.addAll(dawgs);
          merged.addAll(nums);

        System.out.println("merged" + merged);

        students.addAll(dawgs);
        System.out.println("Merged List" + students);


    }
}