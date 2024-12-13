/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson3;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> "Number: " + x;
        System.out.println(convert.apply(5)); // "Number: 5"
    }
}