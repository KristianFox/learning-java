package edu.java.home.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {
    public static Scanner fileReader;


    public static void readFormFile(int lineNumber) throws FileNotFoundException {
        File file = new File("aaaaaaaaaaaaaaaaaaa.txt");
        String read;

        Scanner fileReader = new Scanner(file, "Windows-1251");

        while(fileReader.hasNextLine()) {
            lineNumber++;
            read=fileReader.nextLine();
            funkcion.checkElement(read,lineNumber);
            //System.out.println(fileReader.nextLine());
           // System.out.println(lineNumber);





        }
        fileReader.close();
    }




}
