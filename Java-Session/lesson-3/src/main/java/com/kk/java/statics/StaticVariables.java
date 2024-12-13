/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.statics;

public class StaticVariables {
    public static void main(String[] args) {
        ClassName obj1 = new ClassName();
        ClassName obj2 = new ClassName();

        obj1.increment();
        obj2.increment();

        System.out.println(ClassName.staticVar); // Output will be 2
    }
}

class ClassName {
    static int staticVar = 0;

    void increment() {
        staticVar++;
    }
}
