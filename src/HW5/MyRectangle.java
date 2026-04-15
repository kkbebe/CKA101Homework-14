package HW5;

public class MyRectangle {
	double width;
	double depth;
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		return width * depth;
	}
	
	public MyRectangle() {
		this.width = 0;
		this.depth = 0; 
		
	}
	
	public MyRectangle(double width, double depth) {
		 this.width = 10;
		 this.depth = 20;
	}
}
