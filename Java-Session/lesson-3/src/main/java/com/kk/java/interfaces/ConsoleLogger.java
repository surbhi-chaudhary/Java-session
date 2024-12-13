/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.interfaces;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}