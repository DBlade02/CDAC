package iostreams;
import java.io.*;
public class BufferedRWDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/hp/git/DAC-DBDA-AUG2025/DemoApp/src/iostreams/BufferedRWDemo.java");
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/hp/Desktop/File/BRWDemo.java"));
		
		String line = br.readLine();
		while(line != null) {
			bw.write(line);
			line = br.readLine();
		}
		
		System.out.println("File read and written successfully!");
		br.close();
		bw.close();
	}

}
