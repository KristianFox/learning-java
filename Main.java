package edu.valid.cube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int lineNumber = 0;
        String read="";
        int counter = 0;

     readFromFile.readFormFile(lineNumber,read,counter);
         while (readFromFile.fileReader.hasNextLine()) {
          funkcion.checkElement(read,counter);
          funkcion.checkCounter(counter);

        }

    }
}