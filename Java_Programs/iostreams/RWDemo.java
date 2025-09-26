package iostreams;
import java.io.*;
public class RWDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/hp/git/DAC-DBDA-AUG2025/DemoApp/src/iostreams/RWDemo.java");
		FileWriter fw = new FileWriter("C:/Users/hp/Desktop/File/output.txt");
		int lc = 0;
		int wc = 0;
		int cc = 0;
		int x;
		while( (x = fr.read()) != -1) {
			System.out.print((char)x);
			cc++;
			if(x ==' ') {
			wc++;	
			}
			if(x == '\n')
				lc++;
		}
		fw.write("\n No of chars: "+ cc);
		fw.write("\nNo of words: "+ (wc+lc));
		fw.write("\n No of lines: "+lc);
		
		fr.close();
		fw.close();
		
	}

}
