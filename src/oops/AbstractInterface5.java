package oops;

public class AbstractInterface5 extends Inheritance1 implements AbstractInterface3,AbstractInterface4{
	public void a() { //public should be thr while implementing
		System.out.println("a method");
	}
public void b() {
	System.out.println("b method");//if any one methhod missing while implementing so declare its class as abstact class
}
public static void main(String[] args) {
	AbstractInterface5 a5 = new AbstractInterface5();
	a5.a();
    a5.b();
	System.out.println(a5.roll);
}
}
