/*1.
class Employee{
     public void Work() {
         System.out.println("you are working as an employee!");
        }
   }

class Manager extends Employee{
      public void conductMeeting(){
          System.out.println("This is meeting conduct!");
      }
}



public class JavaWork {
 public static void main(String[] args){

     Employee one = new Manager();
     one.Work(); // upcasting

     Manager boss = (Manager) one; // down casting!
     boss.conductMeeting();
   }
}
 */
/* 2.

class Animal{
    public void sound(){
        System.out.println("Animals talk!");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("A dog barks!");
    }
}

public class JavaWork {
    public static void main(String[] args) {

        Animal n = new Dog();

        Dog y = (Dog) n;
        y.sound();
    }
}
 */

/* 3.
class Student{
    static int count = 0;

    Student(){
        count++;
    }

    public static void displayCount(){
        System.out.println("The total objects created are :" + count);
    }

}

public class JavaWork {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student.displayCount();

       }
    }
*/

class BankAccount{
        static double interestRate = 0.05;

        public double calculate(double principal, int time){
             return principal * time * interestRate ;
        }
}

public class JavaWork {
    public static void main(String[] args) {

        BankAccount b= new BankAccount();
        double interest = b.calculate(200000,3);
        System.out.println("Interest :" + interest);
      }
    }













