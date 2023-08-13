package oops;

public class MethodOverride4 extends MethodOverride3 {
	public void run() {
		System.out.println("you are running");
	}
public static void main(String[] args) {
	MethodOverride4 m4 = new MethodOverride4();
	m4.run();
	MethodOverride3 m3 = new MethodOverride3();
	m3.run();
	//if you want to call parent class method object creation must
}
}
