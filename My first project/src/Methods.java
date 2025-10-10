public class Methods {
    public static void main(String[] args){
        /*
         String name = "Kellia";
         int age = 16;

         happyBirthday(name,age);
        }

    private static void happyBirthday(String name, int age) {
        System.out.print("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s",name);
        System.out.printf("You are %d years old",age);
        System.out.print("Happy Birthday to you!");
    }

*/

        //double result = square(3.1);
        //System.out.println(result);

        int age = 10;
        if(ageCheck(age)){
            System.out.print("You may sign up!");
        }
        else{
            System.out.print("You must have 18+ to sign up");
        }

    }
        static double square(double number){
            return number * number;
        }

        static boolean ageCheck(int age){
            if(age >=18){
              return true;
          }
          else {
              return false;
          }
        }
}
