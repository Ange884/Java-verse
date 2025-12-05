package lala;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Task implements Runnable{
    int num;

    public Task (int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("Task" + num + "has started");
        for (int i=num;i <num*10;i++){
            System.out.println(i);
        }
        System.out.println("Task" + num + "has completed");
    }
}

public  class ExecutorFrameworkDemo {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.shutdown();
    }
}