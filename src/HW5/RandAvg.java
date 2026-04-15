package HW5;

public class RandAvg {
	public static void randAvg() {
		 int rand[] = new int[10];
		 for(int i = 0; i < rand.length; i++) {
			 rand[i] = (int)(Math.random()*100);
			 System.out.print(rand[i] + " ");
		 }
		 int sum =0;
		 
		 
		 for(int i = 0; i < rand.length; i++) {
			 sum += rand[i];
		 }
		 int avg = (int)(sum / rand.length);
		 
		 System.out.println("");
		 System.out.println(avg);
		 
	}
	public static void main(String[] args) {
		randAvg();
	}

}
