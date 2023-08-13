package oops;

public class MethodOverloading8 {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(long a, long b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		MethodOverloading8 m7 = new MethodOverloading8();
		m7.sum(5, 5 );
	}
}
