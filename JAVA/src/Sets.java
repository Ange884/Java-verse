import java.util.*;
import java.util.Collections;

public class Sets {
    public  static  void main(String[] args){
            Set<Integer> list1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
            Set<Integer> list2 = new HashSet<>(Arrays.asList(7,8,9,4,5));

            List<Integer> Sorted = new ArrayList<>(list2);
            Collections.sort(Sorted);
           System.out.println("sorted" + Sorted);


            Set<Integer> common = new HashSet<>(list1);
            common.retainAll(list2);

            if(!common.isEmpty()){
                System.out.println("Have common Elements" + common);
            }else {
                System.out.println("no common!");
            }
            Set<String> names = new TreeSet<>();
            names.add("Ange");
            names.add("Titine");
            names.add("Muheto");
            names.add("Kabebe");

        System.out.println("Automatically Sorted" + names);




    }
}
