/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.patterns;

import java.util.List;

public class TotalValues {
    static int totalSum(List<Integer> integerList){
        int sum = 0;
        for (int number : integerList){
            sum += number;
        }
        return sum;
    }

    static int totalSumEven(List<Integer> integerList){
        int evenSum = 0;
        for (int number : integerList){
            if (number % 2 == 0){
                evenSum += number;
            }
        }
        return evenSum;
    }

    static int totalSumOdd(List<Integer> integerList){
        int oddSum = 0;
        for (int number : integerList){
            if (number % 2 != 0){
                oddSum+= number;
            }
        }
        return oddSum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(totalSum(numbers));
        System.out.println(totalSumEven(numbers));
        System.out.println(totalSumOdd(numbers));
    }
}
