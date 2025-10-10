abstract class paymentGateway{
    double amount;
    void payment(double amount){
        System.out.println("The payment is done!");
    }
}

class paypal extends paymentGateway{
    @Override
    void payment(double amount) {
        System.out.println("Payment done using paypal!");
    }
}

class masterCard extends paymentGateway{
    @Override
    void payment(double amount) {
        System.out.println("payment done using masterCard!");
    }
}
class Momo extends paymentGateway{
    @Override
    void payment(double amount) {
        System.out.println("Payment done using momo!");
    }
}

class PaymentProcessor{
          private paymentGateway gateway;
          public PaymentProcessor(paymentGateway gateway){
              this.gateway = gateway;
          }

          public void process(double amount){
              gateway.payment(amount);
          }
}




public class Payment {
     public static  void main(String[] args){

         PaymentProcessor paypalProcessor = new PaymentProcessor(new paypal());
         PaymentProcessor MomoProcessor = new PaymentProcessor(new Momo());
         PaymentProcessor MasterCardProcessor = new PaymentProcessor(new masterCard());

         paypalProcessor.process(200);
         MasterCardProcessor.process(300);
         MomoProcessor.process(400);
     }
   }
