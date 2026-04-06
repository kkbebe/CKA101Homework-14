package HW4;

import java.util.Scanner;
import java.util.Arrays;


public class HW405 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] time = new int[3];
        System.out.println("please enter the time in yyyy mm dd :");
        
        if(sc.hasNextInt()) {
        	for(int i =0; i < time.length; i++) {
        		time[i] = sc.nextInt();
        	}

        }
    
        System.out.println(Arrays.toString(time));

	}
}