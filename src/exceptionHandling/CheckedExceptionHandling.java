package exceptionHandling;

public class CheckedExceptionHandling {

	public static void main(String[] args) {
	System.out.println("ho");
	
	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	System.out.println("sid");
	}

}
