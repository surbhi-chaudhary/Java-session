/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson1.part1;

public class AnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });

        thread.start();
        System.out.println("In Main");
    }
}
