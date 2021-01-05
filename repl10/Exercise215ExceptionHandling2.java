package com.sofiane.repl10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise215ExceptionHandling2 {
    /*
    Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.

Expected Output:
java.io.FileNotFoundException:  (No such file or directory)
     */

    public static class FileNotFoundException extends IOException {
        public static void main (String[] args) {


            Object file = null;
            File fileObj = new File ( String.valueOf ( file ) );

        }

    }

    }
