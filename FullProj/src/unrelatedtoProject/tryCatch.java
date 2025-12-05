package unrelatedtoProject;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args){
        int age;
        Scanner c = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = c.nextInt();

        try {
            if(age < 18) // FIXED: should be less than 18
                throw new AgeException("Under 18, not allowed to watch the movie!");
            System.out.println("You can watch the movie!");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}



//       x= c.nextInt();
//        System.out.print("Enter the second number!:");
//        y = c.nextInt();
//
//        try {
//            if(y==0)
//                throw new ArithmeticException("avoid zero!");
//            int result = x/y;
//            System.out.println("The result is " + result);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//          catch(Exception e){
//            System.out.println("In parent" + e);
//              System.out.println("is not a number");
//       }

