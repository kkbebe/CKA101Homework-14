package HW6;

public class Calculator { 
	int powerXY(int x, int y) throws CalException {
		if(x == 0 && y == 0) {
			 throw new CalException("不是你X跟Y都是0是怎樣?");
		} else if (y < 0) {
			 throw new CalException("你的Y是負數阿 這樣結果不是整數");
		} else {
			 return (int)Math.pow(x,y);
		}
	}
}
