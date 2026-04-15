package HW5;

import java.util.Scanner;



public class StarSquare {
	
	public static void starSquare(int hight, int width) {
		for(int i = 0; i < hight; i++) {
			for(int j = 0; j < width; j++) {
				 System.out.print("*");
				 
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter the hight and width of the square:");
		
		int hight = sc.nextInt();
		int width = sc.nextInt();
		//她嗎原來直接打2次就好 JAVA會自動抓到兩個數字
		
		starSquare(hight, width);
		
	}
}
