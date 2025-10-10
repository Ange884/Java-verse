import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        int choice;
        boolean isRunning = true;

while(isRunning) {
    System.out.println("*****************");
    System.out.println("Banking Program");
    System.out.println("****************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");

    System.out.println("Enter the choice from(1 - 4):");
    choice = scanner.nextInt();



        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += Deposit();
            case 3 -> balance -= withDraw(balance);
            case 4 -> {
                System.out.println("EXIT");
                isRunning= false;
            }
            default -> System.out.println("Invalid Choice");

        }
       }

    }

    static void showBalance(double balance) {
        System.out.println("***********************");
        System.out.printf("$%.2f", balance);

    }

    static double Deposit() {
        double Amount;
        System.out.println("Enter the amount you want to deposit:");
        Amount = scanner.nextDouble();

        if (Amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return Amount;
        }
    }

    static double withDraw(double balance) {
        double Amount;
        System.out.println("Enter the amount you want to withdraw:");
        Amount = scanner.nextDouble();
        if (Amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else if (Amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return Amount;
        }
    }
}
