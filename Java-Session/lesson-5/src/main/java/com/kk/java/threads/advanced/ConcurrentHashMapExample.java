/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads.advanced;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Create multiple threads to access the map
        Thread thread1 = new Thread(new MapOperations(map, "Thread1"));
        Thread thread2 = new Thread(new MapOperations(map, "Thread2"));
        Thread thread3 = new Thread(new MapOperations(map, "Thread3"));

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

        // Print the final contents of the map
        System.out.println("Final Map: " + map);
    }
}

class MapOperations implements Runnable {
    private final ConcurrentHashMap<String, Integer> map;
    private final String threadName;

    public MapOperations(ConcurrentHashMap<String, Integer> map, String threadName) {
        this.map = map;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Perform operations on the map
        for (int i = 0; i < 5; i++) {
            String key = threadName + "-" + i;
            map.put(key, i);
            System.out.println(threadName + " added: " + key + " = " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Retrieve values from the map
        for (int i = 0; i < 5; i++) {
            String key = threadName + "-" + i;
            Integer value = map.get(key);
            System.out.println(threadName + " retrieved: " + key + " = " + value);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
