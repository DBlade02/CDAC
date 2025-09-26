package iostreams;
import java.io.*;

public class FWDemo {
	public static void main(String[] args) throws IOException{
		
		// File f1 = new File();
		
		FileWriter fw = new FileWriter("C:/Users/hp/Desktop/File/first.txt", true);
		fw.write("\nJava is OOP language\nJava is robust\n");
		fw.write("Java is secure\nJava is platform independednt\n");
		fw.write("Java is Simple");
		fw.write("\nJava is distributed");
		
		System.out.println("File written successfully");
		
		fw.close();
	}

}
