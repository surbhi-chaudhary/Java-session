/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.exceptions;

import java.io.*;



public class CheckedExceptions {
    private static void readFile(String path) throws IOException {
        try {
            var inputStream = CheckedExceptions.class.getResourceAsStream(path);
            if (inputStream == null){
                throw new FileNotFoundException("Resource not found: " + path);
            }
            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while trying to read the file: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        var path = "/input.txt";
        try {
            readFile(path);
        } catch (IOException e) {
            System.err.println("Error while reading a file = "+e);
        }
    }
}


