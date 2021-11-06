package io.github.tingreavinash.JavaConcepts.Concurrency;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10_000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Task is in progress.. please wait");
                Thread.sleep(1000);
            }
            System.out.println("Task Completed!!");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);

            executorService.shutdown();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();

            future.cancel(true);
            future.isDone();
            future.isCancelled();
        }
    }
}
