import java.util.*;
import java.util.Comparator;

public abstract class Primitive {

    public  static  void  main(String[] args){
        ArrayList<Comp> arr = new ArrayList<>();
        arr.add(new Comp(1));
        arr.add(new Comp(3));
        arr.add(new Comp(5));
        arr.add(new Comp(2));
        arr.add(new Comp(9));

        Collections.sort(arr);
        System.out.println(arr);
    }
}
