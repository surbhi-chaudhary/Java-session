/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.interfaces;

public class Main {
    public static void main(String[] args) {
        Loggable logger = new ConsoleLogger();

        logger.log("This is a regular message");
        logger.logInfo("This is an information message");
        Loggable.logError("This is an error message");
    }
}