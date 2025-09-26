/* Write a Java program to read first 3 lines from a file.*/
package Assignment_11;

import java.io.*;

public class Program3 {

    public static void main(String[] args) throws IOException {
        String fileName = "D:/CDAC/Java_Programs/First/src/Assignment_11/Program3.java";
        String resultFileName = "D:/CDAC/Java_Programs/First/src/Assignment_11/result3.txt";
        int lineRead = 3;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName));
            for (int i = 1; i < lineRead; i++) {
                String line = br.readLine();
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } 
		catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("File written successfully.");
    }
}
