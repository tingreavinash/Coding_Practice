package io.github.tingreavinash.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {

        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Count : " + i + ", Thread: " + Thread.currentThread().getName());
            }
        });
    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Count : " + i + ", Thread: " + Thread.currentThread().getName());
            }
        });
    }
}
