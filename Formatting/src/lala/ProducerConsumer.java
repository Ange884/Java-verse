package lala;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

      int capacity;
      Queue <Integer> storage = new LinkedList<>();
      public ProducerConsumer(int capacity){
          this.capacity = capacity;
      }
      public synchronized void produce(int value) throws InterruptedException {
           if(storage.size() == capacity){
               wait();
           }
           storage.add(value);
          System.out.println("Produced " + value);
           notifyAll();
      }

      public synchronized int consume(){
          while(storage.isEmpty()) {
              try {
                  wait();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
          int value = storage.poll();
        System.out.println("Consumed " + value);
        notify();
        return  value;
      }
}
