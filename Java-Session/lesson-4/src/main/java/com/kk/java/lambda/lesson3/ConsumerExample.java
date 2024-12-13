/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda.lesson3;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Hello, World!"); // prints "Hello, World!"

        Consumer<Integer> intConsumer = x -> System.out.print(x+"\n");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerList.forEach(intConsumer);
    }
}
