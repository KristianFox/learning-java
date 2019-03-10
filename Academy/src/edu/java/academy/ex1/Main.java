package edu.java.academy.ex1;

import java.util.ArrayList;
import java.io.*;









        public class Academy{



             static ArrayList<String> fileList = new ArrayList<String>();

            private static String getFileExtension(File file)

            {

                String name = file.getName();

                int lastIndexOf = name.lastIndexOf(".");

                if (lastIndexOf == -1)

                {

                    return ""; // empty extension

                }

                return name.substring(lastIndexOf);

            }

            public static void fileCheck(String s)

            {

                try {

                    File f = null;

                    File[] paths;

                    f = new File(s);

                    paths = f.listFiles();

                    String FilePath="";

                    for(File path:paths)

                    {

                        FilePath=path.toString();

                        if (getFileExtension(path).equals(""))

                        {

// System.out.println(FilePath);

                            fileCheck (FilePath);

                        }

// System.out.println( getFileExtension(path));

                        if(getFileExtension(path).equals(".docx"))

                        {

// System.out.println( getFileExtension(path));

                            fileList.add(FilePath);

                        }

                    }

                }

                catch(Exception e) {

// if any error occurs

                    e.printStackTrace();

                }

            }

            public static void main(String[] args)

            {

// TODO Auto-generated method stub\

// Scanner reader= new Scanner(System.in);

//int sum = reader.nextInt();

//sum=sum/3;

// ArrayList<Integer> list = new ArrayList<Integer>();

// list.add(sum);

// System.out.println(sum);

// reader.close();

                fileCheck("c:/");

                System.out.println(fileList.size());

            }

        }

