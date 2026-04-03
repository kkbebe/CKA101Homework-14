package HW4;

public class HW401 {
	
	public static void main(String[] args) {
		int list[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < list.length;i++) {
			sum += list[i];
		}
		double avg = sum / list.length;
		System.out.println(sum);
		System.out.println(avg);
		for(int i = 0; i < list.length;i++) {
			if(list[i] > avg) {
				System.out.println(list[i]);
			}
		}
		
	}
}
