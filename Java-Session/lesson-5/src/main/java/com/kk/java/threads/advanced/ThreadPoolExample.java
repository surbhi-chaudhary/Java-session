/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimpleTask implements Runnable {
    private final int taskId;

    public SimpleTask(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task ID : " + this.taskId + " performed by "
                + Thread.currentThread().getName());
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {

            for (int i = 0; i < 10; i++) {
                Runnable task = new SimpleTask(i);
                service.execute(task);
            }
            service.shutdown();
        }
    }
}