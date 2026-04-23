package HW7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void CopyFile(String sf1,String sf2) throws IOException {
		File of1 = new File(sf1);
		File of2 = new File(sf2);
		
		try {
			FileReader fr2 = new FileReader(of2);
			BufferedReader br2 = new BufferedReader(fr2);
			
			FileWriter fw1 = new FileWriter(of1, true);
			BufferedWriter bw1 =  new BufferedWriter(fw1);
			String line;
			while((line = br2.readLine()) != null) {
				bw1.write(line);
				bw1.newLine();
			}
			bw1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		CopyFile("src/HW7/Sample.txt", "src/HW7/Data.txt");
	}
	
	
	
	

}
