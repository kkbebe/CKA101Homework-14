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
        int year = time[0];
        int month = time[1];
        int day = time[2];
        
        
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        	System.out.println("it is run year!");
        	daysInMonth[2] = 29;
        	
        }
        int totalDays = 0;
        for(int i = 1; i <= month; i++ ) {
    		totalDays += daysInMonth[i];
    	}
        System.out.printf("is the %dth days of the year",totalDays);
    
        

	}
}