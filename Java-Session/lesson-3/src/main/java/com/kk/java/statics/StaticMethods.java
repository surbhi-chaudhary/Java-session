/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.statics;

public class StaticMethods {

    public static void main(String[] args) {
        ClassNameWithStaticMethod.staticMethod(); // No object is created, directly accessing the static method.
    }
}


class ClassNameWithStaticMethod {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
