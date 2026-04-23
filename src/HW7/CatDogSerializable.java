package HW7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CatDogSerializable {
	public static void main(String[] args) {
		
		Animal[][] a = {
			    { new Dog("bla"), new Dog("pik") },
			    { new Cat("didi"), new Cat("fufu") }
			};
		
		File dataDir = new File("C:/data");
		
		if(!dataDir.exists()) {
			dataDir.mkdirs();
		}
		
		try(FileOutputStream fos = new FileOutputStream("c:/data/Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(a);
			
			
//		for(int i = 0; i < a.length; i++) {
//			 for(int j = 0; j < a[0].length; j++) {
//				  oos.writeObject(a[i][j]);
//			 }
//		}
			
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		 
	}

}
