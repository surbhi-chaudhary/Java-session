/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.exceptions;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}

