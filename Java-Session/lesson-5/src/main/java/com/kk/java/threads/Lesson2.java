/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads;


class Counter {
    private int count = 0;

    // Synchronized method to ensure atomic operation
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {

    private final Counter counter;
    private final int maxIncrements;

    public CounterThread(Counter counter, int maxIncrements) {
        this.counter = counter;
        this.maxIncrements = maxIncrements;
    }

    @Override
    public void run() {
        for (int j = 0; j < maxIncrements; j++) {
            counter.increment();
        }
    }
}

public class Lesson2 {
    public static void main(String[] args) {
        final int NUM_THREADS = 5;
        final int NUM_INCREMENTS = 10000;

        Counter counter = new Counter();

        Thread[] threads = new Thread[NUM_THREADS];

        // Create and start threads
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new CounterThread(counter, NUM_INCREMENTS);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
