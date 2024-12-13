/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.interfaces;

public interface Loggable {
    // Abstract method
    void log(String message);

    // Default method
    default void logInfo(String message) {
        log("[INFO] " + message);
    }

    // Static method
    static void logError(String message) {
        System.err.println("[ERROR] " + message);
    }
}