/*1. Write a Program to read the same program file and find the no. of lines, words
and characters. Write the result in in to a text file (result.txt)*/
package Assignment_11;

import java.io.*;

public class FileAnalyzer {
    public static void main(String[] args) {
        String fileName = "D:\\CDAC\\Java_Programs\\First\\src\\Assignment_11\\FileAnalyzer.java"; 
        String resultFileName = "D:\\CDAC\\Java_Programs\\First\\src\\Assignment_11\\result.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length(); 
                String[] words = line.split("\\s+"); 
                for (String word : words) {
                    if (!word.isEmpty()) { 
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        } 
        try (FileWriter writer = new FileWriter(resultFileName)) {
            writer.write("Analysis of " + fileName + ":\n");
            writer.write("Number of Lines: " + lineCount + "\n");
            writer.write("Number of Words: " + wordCount + "\n");
            writer.write("Number of Characters: " + charCount + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to result file: " + e.getMessage());
        }

        System.out.println("Analysis complete. Results written to " + resultFileName);
    }
}