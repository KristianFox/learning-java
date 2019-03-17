package edu.java.itStep.anagrams;

import static edu.java.itStep.anagrams.HelperClass.areAnagram;

public class Main {

    public static void main(String[] args) {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 's' };

        if (areAnagram(str1, str2)) {
            System.out.println("The two strings are"
                    + " anagram of each other");
        }else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}

