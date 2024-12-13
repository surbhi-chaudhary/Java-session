/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.patterns;

import java.util.List;
import java.util.function.Predicate;
public class StrategyPattern {
    static int totalSum(List<Integer> numbers, Predicate<Integer> selector){
        int sum = 0;
        for (int number : numbers){
            if (selector.test(number)){
                sum += number;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(totalSum(numbers, e -> true));
        System.out.println(totalSum(numbers, e -> e / 2 == 0));
        System.out.println(totalSum(numbers, e -> e / 2 != 0));
    }
}
