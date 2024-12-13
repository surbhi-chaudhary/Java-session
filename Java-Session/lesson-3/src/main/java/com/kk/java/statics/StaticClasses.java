/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.statics;

class OuterClass {
    static class NestedStaticClass {
        void myMethod() {
            System.out.println("This is a method in a static nested class.");
        }
    }
}

public class StaticClasses {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass myInstance = new OuterClass.NestedStaticClass();
        myInstance.myMethod();
    }
}