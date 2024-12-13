/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class CustomLambda {

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;

        System.out.println("10 + 5 = " + add.operation(10, 5));
        System.out.println("10 - 5 = " + subtract.operation(10, 5));

    }
}
