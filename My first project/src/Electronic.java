public class Electronic {
    public static void main(String[] args){

        Laptop l1 = new Laptop();
        l1.display();


      }
   }
   class Computer{
     String brandName = "computer";
     String CPU;

     public void display(){
         System.out.println("Display running");
          }
     public static  void playMusic(){
         System.out.println("Playing with computer");
       }
   }
   class Laptop extends Computer{
         String brandName = "Hp Laptop";

         public void display(){
             System.out.println("Displaying main brand " + super.brandName);
             System.out.println("Displaying laptop brand " + this.brandName);
         }
         public void playingLaptop(){
             System.out.println("Playing with laptop");
         }
      }


      class Desktop extends Computer{
            String brandName = "Dell Desktop";

          public void Display(){
              System.out.println("Displaying main brand" + super.brandName);
              System.out.println("Displaying laptop brand" + brandName);
          }

      }
