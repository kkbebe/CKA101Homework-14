package HW4;

import java.util.Arrays;

public class HW406 {
	public static void main(String[] args) {
        
		int[][] score = {
			    // 索引 0 填上 0 (代表第 0 列與各列的第 0 個元素皆為預留空間)
			    {0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			    {0, 10, 35, 40, 100, 90, 85, 75, 70}, // Index 1: 1考 (1號~8號)
			    {0, 37, 75, 77, 89, 64, 75, 70, 95},  // Index 2: 2考
			    {0, 100, 70, 79, 90, 75, 70, 79, 90}, // Index 3: 3考
			    {0, 77, 95, 70, 89, 60, 75, 85, 89},  // Index 4: 4考
			    {0, 98, 70, 89, 90, 75, 90, 89, 90},  // Index 5: 5考
			    {0, 90, 80, 100, 75, 50, 20, 99, 75}  // Index 6: 6考
		};
		int max = 0;
		int smartAss = 0;
		int smartAssCount[] = new int[score[0].length];
		
		
		
		
		
		for(int i = 1; i < score.length; i++) {
			smartAssCount[smartAss] += 1;
			max = 0;
			for(int j = 1; j < score[i].length; j++) {
				int cValue = score[i][j];
				
				if(max < cValue) {
					max = cValue; 
					smartAss = j;
				}
				
			}
		}
		smartAssCount[0] = -1;
		// 索引值[0] 為 -1 空號,            索引值[1] 為 1號座號
		
		
		
		System.out.print(Arrays.toString(smartAssCount));
		
        

	}

}
