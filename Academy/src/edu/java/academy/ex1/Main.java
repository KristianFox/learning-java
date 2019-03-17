package edu.java.academy.ex1;

import java.util.ArrayList;
import java.io.*;

import static edu.java.academy.ex1.CheckTheDirectory.fileCheck;
import static edu.java.academy.ex1.CheckTheDirectory.fileList;

 class Academy{
 public static void main(String[] args){
 // TODO Auto-generated method stub\
 // Scanner reader= new Scanner(System.in);
 //int sum = reader.nextInt();
 //sum=sum/3;
 // ArrayList<Integer> list = new ArrayList<Integer>();
 // list.add(sum);
 // System.out.println(sum);
 // reader.close();

 fileCheck("C://");
 System.out.println(fileList.size());
 }
}