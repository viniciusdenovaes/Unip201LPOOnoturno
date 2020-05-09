import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TesteInputText {
	
	public static void main(String[] args) {
		
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			
			is = new FileInputStream("files/arquivo.in");
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			String line;
			while( ( line = br.readLine() ) !=null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
