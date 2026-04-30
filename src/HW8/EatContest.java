package HW8;

public class EatContest implements Runnable {
	int bowlCount = 10;
	String name;
	static String winner = "none"; 
	
	EatContest(String name) {
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		EatContest mantou = new EatContest("mantou");
		Thread tmantou = new Thread(mantou);
		
		EatContest james = new EatContest("james");
		Thread tjames = new Thread(james);
		
		tmantou.start();
		tjames.start();
		
		 
	}
	
	
	
	


	@Override
	public void run() {
		while (bowlCount > 1) {
			bowlCount--;
			System.out.println(name + " eats a bowl, " + bowlCount + " bowls left");
			int sleepTime = (int)(Math.random() * 2500 + 500);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
		}
		
		System.out.println(name + " finished all bowl!");

	}
	
	

}
