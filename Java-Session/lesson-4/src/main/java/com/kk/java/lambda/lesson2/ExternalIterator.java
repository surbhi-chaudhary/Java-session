/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson2;

import java.util.Arrays;
import java.util.List;

public class ExternalIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // External Iterator
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println();

        // External Iterator
        for (int i : numbers){
            System.out.println(i);
        }
    }
}
