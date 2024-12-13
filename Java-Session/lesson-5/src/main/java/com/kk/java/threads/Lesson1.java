/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads;


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

public class Lesson1 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Runnable r = ()->{
            System.out.println("It's a lambda thread");
        };
        r.run();
    }
}
