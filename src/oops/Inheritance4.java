package oops;

public class Inheritance4 extends Inheritance3 {
	
	public void multi(int x, int y) {		
		z=x*y;
		System.out.println("product  :"  + z);
}
	public static void main(String[] args) {
		int x=10 , y=20;
		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y);
		i4.multi(x, y);
		i4.sub(x, y);
	}
}