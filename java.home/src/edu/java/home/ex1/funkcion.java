package edu.java.home.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funkcion {

      public static void checkElement(String read,int lineNumber) {
          int counter = 0;
          int sum=0;

              for (int i = 0; i <read.length(); i++) {
                  if (read.charAt(i) == '@') {
                      counter++;
                  } else if (read.charAt(i) == 'Z') {

                      counter--;
                  } else if ( lineNumber==8) {


                      checkCounter(sum);
                      System.out.println(counter);
                      sum=0;


                  }
                  sum+=counter;
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




