/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads;

class Lesson5 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread working");
        } else {
            System.out.println("User thread working");
        }
    }

    public static void main(String[] args) {
        Lesson5 t1 = new Lesson5();
        Lesson5 t2 = new Lesson5();

        t1.setDaemon(true); // Setting the thread as daemon

        t1.start();
        t2.start();
    }
}