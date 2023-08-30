package oops;

public abstract class Vehicle{
	public abstract int getnowheel();
}




 class bus extends Vehicle {
	 
	 public int getnowheel() 
	 {
	 return 2;
	 }
	 
	 
	 class auto extends Vehicle{
		 public int getnowheel() 
		 {
		 return 2;
		 }
		 
		 class test{
			 public static void main(String[] args) {
				bus bb = new bus();
				bb.getnowheel();			}
		 }
	 }
 }