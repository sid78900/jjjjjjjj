 package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
int a=5;
		
		try {
			System.out.println(a/0);
		} catch (NullPointerException e) {
			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("hi");
		}  
	}

	}

