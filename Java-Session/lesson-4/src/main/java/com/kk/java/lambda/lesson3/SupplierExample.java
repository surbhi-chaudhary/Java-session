/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson3;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> getString = () -> "Hello from Supplier!";
        System.out.println(getString.get()); // "Hello from Supplier!"
    }
}

