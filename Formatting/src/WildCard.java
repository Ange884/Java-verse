import java.util.*;

public class WildCard {

    public static void wild(ArrayList<? extends Number> arr){
        System.out.println(arr);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

          ArrayList<Integer> arr = new ArrayList<>();
           arr.add(1);
           arr.add(2);
           arr.add(3);
           arr.add(4);
           arr.add(5);

           wild(arr);


//        System.out.println("Enter the second string:");
//        String b = sc.nextLine();
//        System.out.println("Enter the first number:");
//        int a = sc.nextInt();



    }
}
