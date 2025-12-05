import java.util.concurrent.*;

public class SimpleExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> result = executor.submit(()->{
                return 5+5;
        });

        try{
            System.out.println(result.get());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
    }
}
