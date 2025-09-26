package iostreams;
import java.io.*;
public class FRDemo {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C:/Users/hp/Desktop/File/first.txt");
		
		int x;
		while( (x = fr.read() ) != -1) {
			System.out.print((char)x);
		}
		fr.close();
	}

}
