import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {
    public static  void main(String []a){
        double num= 50000.456;
        NumberFormat usFormat= NumberFormat.getInstance(Locale.US);
        NumberFormat frFormat= NumberFormat.getInstance(Locale.FRANCE);
        System.out.println("French format:" + frFormat.format(num));
        System.out.println("US format:" + usFormat.format(num));

    }
}
