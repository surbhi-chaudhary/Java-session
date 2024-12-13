/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.variables;

public class JavaVariables {
    // Instance variable
    private int instanceVar;

    // Class variable (static field)
    private static int staticVar;

    // Final variable
    private final int finalVar = 10;

    // Any constant which you want to be public this the pattern you should use
    public static final String DEFAULT = "default";

    public void myMethod(int paramVar) {
        // Local variable
        int localVar = 5;

        // Accessing variables
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Final variable: " + finalVar);
        System.out.println("Parameter variable: " + paramVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void myStaticMethod() {
        // Accessing static variable
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        JavaVariables javaVariables = new JavaVariables();
        javaVariables.myMethod(10);

        JavaVariables.myStaticMethod();
        System.out.println(JavaVariables.DEFAULT);

    }
}

