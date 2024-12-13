/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson1.part1;

public class LambdaExpression {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("In another thread"));
        thread.start();
        System.out.println("In Main");
    }
}
