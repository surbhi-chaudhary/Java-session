/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.threads.virtual;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

public class VirtualThreadExample {
    static void executeVirtualThreadV0(){
        for (int i = 0; i < 1_000_000; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(10000); // Wait for 10 seconds
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    static void executeVirtualThreadV1() throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(1_000_000);
        for (int i = 0; i < 1_000_000; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(10000); // Wait for 10 seconds
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
    }

    static void executeNormalThread(){
        for (int i = 0; i < 1_000_000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10000); // Wait for 10 seconds
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    static void executeNormalThreadV1(){
        var executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 1_000_000; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(10000); // Wait for 10 seconds
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.close();
    }


    static void executeVirtualThreadV2() {
        var executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 1_000_000; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(10000); // Wait for 10 seconds
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.close();
    }

    public static void main(String[] args) throws InterruptedException {
        executeVirtualThreadV2();
    }
}
