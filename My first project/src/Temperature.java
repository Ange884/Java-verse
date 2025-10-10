import java.util.Scanner;
public class Temperature {
    public static  void main(String[] args){
       Scanner scanner = new Scanner(System.in);
          double temp;
          double NewTemp;
          String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? ( C or F):");
        unit = scanner.next().toUpperCase();

        NewTemp = (unit.equals("C"))? (temp - 32) * 5/9 : (temp * 5/9) + 32 ;

        System.out.println(NewTemp + unit);

       scanner.close();

    }
}
