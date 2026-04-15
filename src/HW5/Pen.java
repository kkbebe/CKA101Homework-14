package HW5;

public abstract class Pen {
	String brand ="";
	int price = 0;
	
	void setBrand(String brand) {
		this.brand = brand;
		 
	}
	String getBrand() {
		return this.brand;
		 
	}
	
	void setPrice(int price) {
		 this.price = price;
	}
	int getPrice() {
		return this.price;
	}
	
	
	
	
	
	abstract void write();
	
	public static void main(String[] args) {
		Pen pc = new Pencil("libry",10);
		Pen Ik = new InkBrush("lang",50);
		
		pc.write();
		System.out.println(pc.getPrice());
		
		Ik.write();
		System.out.println(Ik.getPrice());
		
		
		
	}
	
}

class Pencil extends Pen{
	void write() {
		System.out.println("鉛筆直接寫");
	}
	
	Pencil(String brand, int price){
		this.brand = brand;
		this.price = price;
		
	}
}

class InkBrush extends Pen{
	void write() {
		 System.out.println("沾墨水後寫");
	}
	
	InkBrush(String brand, int price){
		this.brand = brand;
		this.price = price;
		
	}
}

 



