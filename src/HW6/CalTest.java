package HW6;

public class CalTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
			System.out.println(c.powerXY(0,-6));
		} catch (CalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
