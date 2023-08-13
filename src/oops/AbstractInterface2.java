package oops;

public class AbstractInterface2 implements AbstractInterface1 {
	public void a()  //override 
	{
		System.out.println(" a method");
	}
public static void main(String[] args) {
	AbstractInterface2  a2 = new AbstractInterface2();
	a2.a();
}
}
