/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
            FactorialTask task = new FactorialTask(5);
            Future<Long> future = executor.submit(task);

            System.out.printf("Factorial of %d is %d\\n", 5, future.get());
            executor.shutdown();
        }
    }
}
