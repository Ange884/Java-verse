import java.util.Arrays;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 56, 89, 90);
        List<String> list2 = Arrays.asList("Nana", "Gold");

        displayList(list2);  
        displayList(list1);
    }

    // generic method that can accept any list type
    public static void displayList(List<?> list) {
        for (Object var : list) {
            System.out.println(var);
        }
    }
}
