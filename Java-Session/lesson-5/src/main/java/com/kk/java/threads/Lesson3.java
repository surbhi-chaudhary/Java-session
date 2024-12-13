/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads;

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String take() {
        // Wait until message is available.
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        // Wait until message has been retrieved.
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

public class Lesson3 {

    public static void main(String[] args) {
        Message message = new Message();

        // Create a producer thread
        Thread producerThread = new Thread(() -> {
            String[] messages = {"Hello", "World", "!", "This", "is", "a", "test", "message"};
            for (String msg : messages) {
                message.put(msg);
                System.out.println("Produced: " + msg);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            message.put("DONE");
        });

        // Create a consumer thread
        Thread consumerThread = new Thread(() -> {
            String msg;
            do {
                msg = message.take();
                System.out.println("Consumed: " + msg);
            } while (!msg.equals("DONE"));
        });

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
