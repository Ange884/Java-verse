//import java.text.NumberFormat;
//import java.util.*;
//
//public class formatting {
//    public static void main(String[] args) {
//        double amount = 1999.99;
//
//        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(amount));
//        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
//        System.out.println("Japan: " + NumberFormat.getCurrencyInstance(Locale.JAPAN).format(amount));
//    }
//}

//import java.util.*;
//
//public class formatting {
//    public static void main(String[] args) {
//        double number = 1200000.75;
//
//        System.out.printf(Locale.US, "US: %, .2f%n", number);
//        System.out.printf(Locale.FRANCE, "France: %, .2f%n", number);
//    }
//}
import  java.util.*;
public class formatting {
    public static void main(String[] args) {
        System.out.printf("%-10s %5s %10s%n", "Name", "Qty", "Price");
        System.out.printf("%-10s %5d %10.2f%n", "Apple", 5, 2.5);
        System.out.printf("%-10s %5d %10.2f%n", "Banana", 12, 1.75);
    }
}
