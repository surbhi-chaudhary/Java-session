/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.lambda;


@FunctionalInterface
interface GreetService {
    void greet(String name);
}


@FunctionalInterface
interface GreetServiceV2{
    void greet(String name, String message);
}

public class GreetLambda {

    public static void main(String[] args) {
        //GreetService greetService = (String message) -> System.out.println("Hello "+message);
        GreetService greetService = message -> System.out.println("Hello "+message);

        greetService.greet("Harsha");
        greetService.greet("Surbhi");


        //GreetServiceV2 greetServiceV2 = (String name, String message) -> System.out.println(message +" "+name);
        GreetServiceV2 greetServiceV2 = (name, message) -> System.out.println(message +" "+name);
        greetServiceV2.greet("Harsha", "Hello");
        greetServiceV2.greet("Surbhi", "Hello");
    }
}
