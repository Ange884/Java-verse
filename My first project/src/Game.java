import java.util.Scanner;
public class Game {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String item;
       char Currency = '$';
       double price;
       int quantity;
       double total;

        System.out.print("Which item would you like to buy?:");
        item = scanner.nextLine();

        System.out.print("How many would you like to buy?:");
        quantity = scanner.nextInt();

        System.out.println("what is the price for the item?:");
        price = scanner.nextDouble();

        total = quantity * price ;

        System.out.println("The Total Amount is :" + total);

       scanner.close();

    }
}
