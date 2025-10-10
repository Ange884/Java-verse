import java.util.Scanner;

class People{
    int id;
    String name,dob;
}

class Account extends People {
    String accountNumber;
    double balance = 0;
    double Amount;



    public void deposit( double Amount) {
        if (Amount < 0) {
            System.out.println("Amount can't be negative");

        } else {
            balance += Amount;
            System.out.println("The new balance is " + balance);
        }
    }

    public void withdraw(double Amount) {
        if (Amount > balance) {
            System.out.println("Amount can't be greater than balance");
        } else {
            balance -= Amount;
            System.out.println("The remaining balance is " + balance);
        }
    }
}

public class Question {
    public  static void main(String[] args){
             Scanner scanner = new Scanner(System.in);
             Account acc = new Account();

             System.out.print("Enter your name here:");
             acc.name = scanner.nextLine();

             System.out.print("Enter the amount to deposit:");
             acc.Amount = scanner.nextDouble();
             acc.deposit(acc.Amount);
             double withdraw;

             while(true){
             System.out.print("Enter the amount you want to withdraw?:");
             withdraw = scanner.nextDouble();
             if(withdraw > acc.balance){
                 System.out.println("Amount can't be greater than balance");
                 System.out.println("Please enter a valid amount!");
             } else if (withdraw <0) {
                 System.out.println("Amount can't be less than 0!");
             }else {
                 acc.withdraw(withdraw);
                 break;

                }
             }
        scanner.close();
    }

}
