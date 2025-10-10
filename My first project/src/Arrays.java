import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "banana","cake"};
        String target;
        boolean isFound= false;

        System.out.print("Enter a fruit you wanna search for?:");
        target = scanner.nextLine();

        for(int i = 0;i< fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.print("Element found at index" + " " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.print("Element was not able to be found!");
        }
    }
}
