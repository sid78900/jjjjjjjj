package oops;

public class MethodOverloading4 extends MethodOverloading3{

	public static void main(String[] args) {
		System.out.println(add(10,5));
		System.out.println(add(10,5,10));
		System.out.println(add(10,20));
		// in static method we can call class directly
		
		System.out.println(MethodOverloading4.add(10, 20));
		System.out.println(MethodOverloading4.add(10, 20,30));
	}

}
