package exceptionHandling;

public class UncheckedException {
	public static void main(String[] args) {
		int a=20;
		//System.out.println(a/0);//AIRTHMETIC_EXCEPTION
		
		String s=null;
		//System.out.println(s.length());//NullPointerException
		
		String st="1aaa2345";
		//int i=Integer.parseInt(st);//. The parseInt function converts its first argument to a string, parses that string, then returns an integer or NaN 
		//System.out.println(i);
		
		int z[]= new int[5];
		z[10]=100;//ArrayIndexOutOfBoundsException
	}

}
