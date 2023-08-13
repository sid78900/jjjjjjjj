package exceptionHandling;

public class HandlingUncheckedException {
	public static void main(String[] args) {
		int a=5;
		
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		System.out.println("hi");
	}

}
