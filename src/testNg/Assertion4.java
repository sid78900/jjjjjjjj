package testNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion4 {
	@Test
	public void testcase5() {
		int i=30;
		int j=30;
		try {
			Assert.assertTrue(i>j);
		} catch (Error e) {
			
			e.printStackTrace();//if wont remove this error will be shown up
		}
System.out.println("assertion check");		
		
	}

}
