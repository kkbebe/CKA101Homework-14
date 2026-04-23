package HW7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectSerReader {
	public static void main(String[] args) {
		File f = new File("c:/data/Object.ser");

		try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			try {
				Animal[][] a = (Animal[][])ois.readObject();
				
				
				for(int i = 0; i < a.length; i++) {
				 for(int j = 0; j < a[0].length; j++) {
					 a[i][j].speak();
				 }
			}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
