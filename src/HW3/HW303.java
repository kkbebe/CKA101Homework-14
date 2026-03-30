package HW3;

import java.util.Scanner;

public class HW303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please type the number that you don't like:");
		int number = sc.nextInt();
		int c = 0;
		for(int j = 1;j <= 49;j++) {
			if (j != number) {
				if(c != 6 ) {
					System.out.print(j + "\t");
					c++;
					
				} else {
					
					System.out.print("\n" + j + "\t");
					c = 1;
					
					
				}

				
			}
			
			
		}
			
		
		
		

		
	}

}
