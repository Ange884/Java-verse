import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class InsertRemove {
    public static  void main(String[] args){
        List<String> items = new ArrayList<>(Arrays.asList(
                "Nziza" ,"Ange", "Tona", "Rwanda"
        ));

        items.remove("Ange");
        System.out.println(items);

        Collections.sort(items);
        System.out.println("Sorted List" + items);

        Collections.reverse(items);
        System.out.println("Reversed List" + items);

    }
}
