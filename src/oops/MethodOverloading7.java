package oops;

public class MethodOverloading7 {
public void sum(int a, long b) {
	System.out.println(a+b);
}
public void sum(long a, int b) {
	System.out.println(a + b);
}
public static void main(String[] args) {
	MethodOverloading7 m7 = new MethodOverloading7();
	m7.sum(0, 0);//ambigity issue : a situation in which something has more than one possible meaning and may therefore cause confusion
}
}
