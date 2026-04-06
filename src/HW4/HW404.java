package HW4;

import java.util.Scanner;

public class HW404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] money = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		System.out.println("What you want? :");
		int asking = sc.nextInt();
		System.out.println("employee numbers that got enough money:");
		int sum = 0;
		for(int i = 0; i < money.length; i++) {
			if(asking <= money[i][1]) {
				System.out.print(money[i][0] + " ");
				sum += 1;
			}
			
		}
		
		System.out.printf("total %d dumb ass", sum);
		
		
	}
}
