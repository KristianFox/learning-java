package edu.java.academy.ex1;

import java.io.File;
import java.util.ArrayList;

public class CheckTheDirectory {
 static ArrayList<String> fileList = new ArrayList<String>();
 public static String getFileExtension(File file) {
 String name = file.getName();
 int lastIndexOf = name.lastIndexOf(".");
 if (lastIndexOf == -1){
 return ""; // empty extension
 }
 return name.substring(lastIndexOf);
 }
    public static void fileCheck(String s){
        try {
            File f = null;
            File[] paths;
            f = new File(s);
            paths = f.listFiles();
            String FilePath="";
            for(File path:paths) {
                FilePath=path.toString();
                if (getFileExtension(path).equals("")){
                    // System.out.println(FilePath);
                    fileCheck (FilePath);
                }
                // System.out.println( getFileExtension(path));
                if(getFileExtension(path).equals(".txt")){
                    // System.out.println( getFileExtension(path));
                    fileList.add(FilePath);
                }
            }
        }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
        }
    }
}
