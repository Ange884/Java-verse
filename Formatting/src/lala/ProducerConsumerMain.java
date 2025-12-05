package lala;

public class ProducerConsumerMain {
    public  static void main(String[] args){
        ProducerConsumer pc = new ProducerConsumer(10);
        Thread t1 = new Thread(() ->{
            for (int i=0;i < 50;i++){
                try{
                    pc.produce(i);
                    Thread.sleep(10);
                }catch (InterruptedException e){

                }
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i=0;i < 50;i++){
                try{
                    pc.consume();
                    Thread.sleep(10);
                }catch (InterruptedException e){

                }
            }
        });

        t1.start();
        t2.start();
    }
}
