package edu.valid.cube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Manov\\Desktop\\aaaaaaaaaaaaaaaaaaa.txt");

        Scanner fileReader = new Scanner(file, "Windows-1251");
        int lineNumber = 0;
        String read ;
        int counter= 0 ;
        while (fileReader.hasNextLine()) {
           lineNumber++;
            read =fileReader.nextLine();
            for (int i = 0; i<7; i++   ){
               if(read.charAt(i)=='@'){
                   counter++;
                }
               else if(read.charAt(i)=='Z'){

                 counter--;
               }
               if(lineNumber==8){

                  System.out.println(counter);
                  counter=0;
                  lineNumber=0;
               }
            }

        }

    }
}