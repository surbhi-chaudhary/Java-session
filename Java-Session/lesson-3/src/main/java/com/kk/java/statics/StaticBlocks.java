/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.statics;

public class StaticBlocks {
    static int num;
    static String myStr;

    // Static block
    static {
        num = 97;
        myStr = "Static keyword in Java";
    }

    public static void main(String args[]) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of myStr: " + myStr);
    }
}