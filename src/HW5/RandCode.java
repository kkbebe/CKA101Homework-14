package HW5;

public class RandCode {
	public static String genAuthCode() {
		String[] s = new String[8];
		int RandType = 0;
		for(int i = 0; i < s.length; i++) {
			RandType = (int)(Math.random() * 3);
			System.out.println(RandType);
			if(RandType == 0) { //upper case 
				s[i] = Character.toString((char)(Math.random() * 26 + 65));
			} else if(RandType == 1) { //lower case
				s[i] = Character.toString((char)(Math.random() * 26 + 97));
			} else {  //number
				s[i] =  Integer.toString((int)(Math.random() * 9));
			}
		}
		return String.join("", s);
		
	}
	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}

}
