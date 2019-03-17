package edu.java.itStep.fileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName;
        String searchingWord;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter file name: ");
        fileName = scan.next();

        // Read the searching word and convert it to lower case for case-insensetive searching
        System.out.print("Enter word: ");
        searchingWord = scan.next().toLowerCase();

        if (searchingWord.equals("")) {
            throw new Exception("Empty searching pattern");
        }

        // Read file content in one string
        String content = null;
        try {
            content = readFileInString(fileName);
        } catch (IOException e) {
            System.out.printf("Problem with reading %s\n", fileName);
            e.printStackTrace();
            return;
        }

        int wordLength = searchingWord.length();
        int wordCount = 0;
        int currentIndex = -1; // Black listing - we accept that we don't have the word in the text
        List<Integer> wordIndexes = new ArrayList<Integer>();

        /* Start reading the file from the first index.
         * If the word is missing we can break from the loop.
         * If we found the word we increment the `index` variable with the word length
         * and continue searching for the word. The last check is the end of the file
         */
        for (int index = 0; index < content.length(); index += currentIndex) {
            currentIndex = content.indexOf(searchingWord, index);

            if (currentIndex == -1) {
                break;
            } else {
                wordIndexes.add(currentIndex);
                currentIndex += wordLength;
            }

            wordCount++;
        }

        // Print the result
        System.out.println("Word count: " + wordCount);
        for (Integer index : wordIndexes) {
            System.out.println("Index: " + index);
        }
    }

    private static String readFileInString(String fileName) throws IOException{
        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder((int)file.length());

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                stringBuilder.append(scan.nextLine()).append(System.lineSeparator());
            }

            return stringBuilder.toString().toLowerCase();
        }
    }
}
