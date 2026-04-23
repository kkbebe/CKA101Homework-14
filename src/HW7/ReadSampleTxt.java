package HW7;

import java.io.*;

public class ReadSampleTxt {
	public static void main(String[] args) {
		File f = new File("src/HW7/Sample.txt");
		int lineCount = 0;
		int charCount = 0;
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			try {
				while((line = br.readLine()) != null) {
				
					lineCount++;
					charCount += line.length();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Sample.txt 有%d個位元組 %d個字元 %d列資料", f.length(), charCount, lineCount);
		
		
		
		
		
		
		
		
		
		
	}

}
