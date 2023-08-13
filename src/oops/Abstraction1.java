package oops;

public abstract class Abstraction1 {

	static int a=5;
	int b=5;
	final int c=10;
	//default constructor
	Abstraction1(){
		System.out.println("hello abstract class");
	}
	//abstract method 
	abstract void eat();
	
	//non abstract method
	public void a() {
		System.out.println("non abstract method");
	}
}
