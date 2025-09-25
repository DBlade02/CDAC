/*2. Write a program to read the same program file and write it to other file with
the lines number added before each line, starting from 1. */
package Assignment_11;

import java.io.*;

public class Program2 {
    public static void main(String[] args)throws IOException{ 
        String fileName = "D:\\CDAC\\Java_Programs\\First\\src\\Assignment_11\\Program2.java";
        String resultFileName = "D:\\CDAC\\Java_Programs\\First\\src\\Assignment_11\\result2.txt";

        BufferedWriter writer;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            writer = new BufferedWriter(new FileWriter(resultFileName));
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + " " + line + "\n");
                lineNumber++;
            }
        }
        writer.close();
        System.out.println("File written successfully.");
    }
}   
