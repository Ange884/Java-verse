import java.util.Scanner;
public class Loops {
    public static void main(String[] args) throws InterruptedException {
        /*
        int max;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines u want to loop?:");
        max = scanner.nextInt();
         for(int i = 1; i < max ; i++){
             System.out.println(i);
         }

        scanner.close();


        Scanner scanner = new Scanner(System.in);
        int start = 10;

        for (int i = start ; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
*/
        int rows, columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        rows = scanner.nextInt();


        System.out.print("Enter the number of columns:");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use:");
        symbol = scanner.next().charAt(0);


       for(int i= 0;i < rows; i++ ){
           for (int j = 0; j < columns;j++){
               System.out.print(symbol);
           }
           System.out.println( );
       }



    }
}
