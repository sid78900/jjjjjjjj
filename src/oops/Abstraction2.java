package oops;

public class Abstraction2 extends Abstraction1{
public void eat() {
	System.out.println("eating");
}
public static void main(String[] args) {
	Abstraction2 a2= new Abstraction2();
	a2.eat();
	a2.a();
}
}
