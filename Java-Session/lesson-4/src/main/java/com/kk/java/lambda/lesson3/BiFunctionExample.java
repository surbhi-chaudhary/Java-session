/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson3;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> sumAsString = (x, y) -> "Sum: " + (x + y);
        System.out.println(sumAsString.apply(5, 7)); // "Sum: 12"
    }
}
