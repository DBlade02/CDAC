//Write a program to find unique words in file
package Assignment_11;

import java.io.*;

public class Program6 {

    public static void main(String[] args) throws IOException {
        {
            String fileName = "D:/CDAC/Java_Programs/First/src/Assignment_11/Program6.java";
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            System.out.println(word);
                        }
                    }
                }
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("File read successfully.");
        }

    }
}
