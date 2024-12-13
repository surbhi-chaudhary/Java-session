/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson3;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));
    }
}
