package edu.valid.cube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funkcion {
      public static void checkElement(String read, int counter){
            for (int i = 0; i<read.toCharArray().length; i++) {
                if (read.charAt(i) == '@') {
                    counter++;
                } else if (read.charAt(i) == 'Z') {

                    counter--;
                }
                if(read.charAt(i) == '#'){
                    checkCounter(counter);



                }
            }

          }
          public static void checkCounter(int counter){
            if(counter>=6){
             System.out.println("True");
            }
           else{
            System.out.println("False");
            }

          }

    }




