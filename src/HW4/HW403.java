package HW4;

public class HW403 {
	public static void main(String[] args) {

		String a[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		System.out.println(a.length);
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length(); j++) {
				char b = a[i].charAt(j);
				if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
					sum += 1;
				}
			}
		}
		System.out.println(sum);
		
	}

}
