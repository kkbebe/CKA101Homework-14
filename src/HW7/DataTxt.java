package HW7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataTxt {
    public static void main(String[] args) {
    	try (FileWriter fr = new FileWriter("src/HW7/Data.txt", true); 
    			//一定要用try-with-resuorse 架構 才會自動的幫你 .close() 不然文字
    			//都還沒有寫入檔案裏面 程式就結束了
    			
    			BufferedWriter br = new BufferedWriter(fr);) {
    		
			
			for(int i = 0; i < 10; i++) {
				int number = (int)(Math.random()*1000+1);
				System.out.print(number + " ");
				 br.write(number + " "); 
			}
			br.newLine();
    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    }
}