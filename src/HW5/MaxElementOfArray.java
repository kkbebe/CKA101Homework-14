package HW5;

public class MaxElementOfArray {
	public static int maxElement(int x[][]) {
		int max = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				 if(max < x[i][j]) {
					 max = x[i][j];
				 }
			 } 
		 }
		return max;
	}
	
	
	public static double maxElement(double x[][]) {
		double max = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				 if(max < x[i][j]) {
					 max = x[i][j];
				 }
			 } 
		 }
		return max;
	}
	
	public static void main(String[] args) {
		int[][] intArray = {
	            {1, 6, 3},
	            {9, 5, 2}
	        };

	        // 2. 浮點數二維陣列 (double[][])
        double[][] doubleArray = {
            {1.2, 3.5, 2.2},
            {7.4, 2.1, 8.2}
        };
        
        System.out.println(maxElement(intArray));
        System.out.println(maxElement(doubleArray));
	}

}
