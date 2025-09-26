package Assignment_11;
import java.io.*;

public class Program4 {
    public static void main(String[] args) throws IOException {
        String fileName = "D:/CDAC/Java_Programs/First/src/Assignment_11/Program4.java";

		String LongString = ""; 
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
				if (line.length() > LongString.length()) {
					LongString = line;
				}
		    }
		}

		System.out.println("Longest line: " + LongString);
	}

}
