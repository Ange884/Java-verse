import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayLoops {
    public static void main(String[] args) {
        /* 1.
         for (int i=1; i<=10; i++ ){
             System.out.println(i);
         }
       */
        /* 2.
        int i = 1;
        while(i <=20){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
         */
        /* 3.
        int sum = 0;
        for(int i= 1; i<=10;i++){
            sum += i;
        }
        System.out.println(sum);

         */
        /* 4.
        int[] numbers = {1,2,3,4,5};
        System.out.print("Original array:");
        for(int num:numbers){
            System.out.print(num + " ");
        }
        int n = numbers.length;
        for(int i=0; i < n/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[n-1-i];
            numbers[n-1-i] = temp;
        }
        System.out.println("\n");
        System.out.println("Reversed array is:");
        for(int num:numbers){
            System.out.println(num + " ");
        }
        */
        /* 5.
        int[] numbers = {1,2,3,4,5};
        int i= 0;
        int maximum = numbers[i];
        for(i=0; i< numbers.length; i++){
            if(numbers[i]> maximum){
                maximum = numbers[i];
            }
        }
        System.out.println("The maximum number is :" + maximum);
        */
        /* 6.
        int[] numbers = {1,2,3,4,5};
        int odds=0;
        int evens =0;

        for(int i =0;i < numbers.length; i++){
            if( numbers[i] % 2 == 0){
                evens++;
            }
            else {
                odds++;
            }
        }
        System.out.println("The number of even numbers is:" + evens);
        System.out.println("The number of odd numbers is:" + odds);
         */
        /* 7.
        String[] tools = {"pen","pencil","books","Rulers"};
        String target = "books";
        boolean isFound = false;

        for(int i = 0; i <tools.length; i++){
            if(tools[i].equals(target)) {
                System.out.println("Object found at index:" + i);
                isFound = true;
            }
            }
        if(!isFound){
            System.out.println("element was not able to be found!");
        }
         */
        /* 8.
        int result;
        for(int i = 0; i <= 12; i++){
            result = i * 5;
            System.out.println(i + " * " + 5 + " = "+ result);
        }
        */
        /* 9.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number u wanna find factorial for?:");
        int n = scanner.nextInt();
        int fact = 1;

        for(int i=1; i <=n;i++){
            fact *= i;
        }

        System.out.println("The factorial is :" + fact);

        scanner.close();
        */
        /* 10.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to check for?:");
        int n =  scanner.nextInt();
        boolean isPrime = true;

        if(n<=1){
            System.out.println("Not a prime number!");
        }else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.print("It is a prime number!");
        }
        if(!isPrime){
            System.out.println("It is not a prime number!");
        }

        scanner.close();
        */

        /* 11.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day you want(1 - 7) to search for?:");
        int day = scanner.nextInt();



        switch (day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.println("Invalid day selected");
        }

        scanner.close();

         */
  /* 12.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the alphabet to search for?:");

        char ch = scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        switch(ch){
            case 'a', 'e','i','o','u' :
                System.out.println("It is a vowel!");
                break;
            default:
                if (ch >= 'a' && ch <= 'z'){
                    System.out.print("it is a consonant!");
                }else {
                    System.out.print("Invalid. Please enter an alphabet!");
                }
        }
        scanner.close();

*/
        /* 14.
        int[] numbers  = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for(int i= 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        int Average = sum/ numbers.length;
        System.out.println("The average is :" + Average);
        */

/*  15.
        int[] numbers = {1,8,9,30,43,20,65};

        Arrays.sort(numbers);

        System.out.println("sorted array is:");
        for(int num:numbers){
            System.out.print(num + " ");
        }
        */



        int first = 0 , second = 1;
        int n= 10;
        System.out.println("printing fibonacci series up to " + n + "terms");
        for (int i= 0;i < n ; i++ ){
            System.out.print(first + " ");
            int next = first + second;
            first = second ;
            second = next;
        }
    }

}
