/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads.advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        // Create multiple threads
        Thread thread1 = new Thread(new IncrementTask(example));
        Thread thread2 = new Thread(new IncrementTask(example));
        Thread thread3 = new Thread(new IncrementTask(example));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + example.getCount());
    }
}

class IncrementTask implements Runnable {
    private final ReentrantLockExample example;

    public IncrementTask(ReentrantLockExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        // Perform multiple increments
        for (int i = 0; i < 10000; i++) {
            example.increment();
        }
    }
}
