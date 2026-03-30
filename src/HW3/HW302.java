package HW3;

import java.util.Scanner;

public class HW302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randNum = (int)(Math.random() * 10);
		
		System.out.println("guess a number:");
		while(true) {
			
			int input = sc.nextInt();
			if (input == randNum) {
				System.out.printf("guess right! it is %d",randNum );
				break;
			} else {
				System.out.printf("Bull shxt, try again:" );
			}
		}
		
	}

}
