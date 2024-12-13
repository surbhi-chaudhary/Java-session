/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.exceptions;


import java.io.StringReader;

public class TryWithAutoResource {
    public static void main(String[] args) {
        String data = "Hello, World!";

        try (StringReader reader = new StringReader(data)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
