/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads;

public class Lesson4 extends Thread {
    public Lesson4(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " running");
        }
    }

    public static void main(String[] args) {
        Lesson4 lowPriorityThread = new Lesson4("Low Priority");
        Lesson4 highPriorityThread = new Lesson4("High Priority");

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        highPriorityThread.start();
    }
}
