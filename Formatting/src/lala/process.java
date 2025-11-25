package lala;

public class process {
        public static void main(String[] args){
            Runnable boy = () -> {
                   for (int i =0 ; i<20 ;i++) {
                       System.out.println("Boy");
                       try {
                           Thread.sleep(10);
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
          };
            Runnable girl = () ->{
                for (int i=0; i<20; i++){
                    System.out.println("girl");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            Thread boyThread = new Thread(boy);
            Thread GurlThread = new Thread(girl);

            boyThread.start();
            GurlThread.start();


        }
    }
