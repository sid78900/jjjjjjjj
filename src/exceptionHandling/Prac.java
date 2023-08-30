package exceptionHandling;

public class Prac {

	public static void main(String[] args) {
		
		int a=5;
		try {
			System.out.println(a/0);
		
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("ddd");
		int b[] = new int [10];
		
		
		//array out of bound exception
		try {
			b[50]=100;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	System.out.println("ok");
	
	String k =null;
	try {
	System.out.println(k.length());
	}catch(ArrayIndexOutOfBoundsException e) {
		
	}
	
	
	   
	}

}
