/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson2;

import java.util.Arrays;
import java.util.List;

public class InternalIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach((Integer value) -> System.out.println(value));

        // This can be further trimmed to following code because we already
        // defined the type numbers as Integer no need to explicitly specify it
        // Also `(Integer value)` parentheses is optional but only for one parameter lambda
        numbers.forEach(value -> System.out.println(value));
    }
}
