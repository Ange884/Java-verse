import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapSorting {
    public static void main(String[] args){

        Map<String,Integer> studentMarks = new HashMap<>();
         
        studentMarks.put("Nziza", 90);
        studentMarks.put("Muheto", 50);
        studentMarks.put("Kelia", 60);
        studentMarks.put("Nora", 70);
        studentMarks.put("Kirezi", 80);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(studentMarks.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted map
        System.out.println("Students sorted by marks: " + sortedMap);

    }
}
