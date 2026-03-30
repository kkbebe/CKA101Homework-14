package HW3;

import java.util.Scanner;

public class HW301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Homework 301");
		System.out.print("Please input numbers for triangle:\n");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(a + " " + b + " " + c + "\n");
		if (a != 0 && b != 0 && c != 0) {
			if (a == b && a == c && b == c) {
				System.out.println("正三角形");
			}
			else if(a == b || a == c || b == c) {
				System.out.println("等腰三角形");
			}
			else {
				System.out.println("其他三角形");
			}
			
			
			
		} else { 
			System.out.println("this isn't a triangle");
		}
		
		System.out.println("===========================");
		
		
		
		

	}
			
		
	
}
