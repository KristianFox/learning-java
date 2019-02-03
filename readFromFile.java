package edu.valid.cube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {
    public static Scanner fileReader;

    public static void readFormFile(int lineNumber,String read, int counter) throws FileNotFoundException {
        File file = new File("aaaaaaaaaaaaaaaaaaa.txt");

        Scanner fileReader = new Scanner(file, "Windows-1251");
        lineNumber++;
        read =fileReader.nextLine();

    }




}
