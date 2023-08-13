package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void TestCase3() {
		String ActMsg = "Google";
		String ExpRes = "Google";
		
		try {
			Assert.assertEquals(ActMsg, ExpRes ,"Actual and exp or not matching");
		} catch (Error e) {
		
		}
		System.out.println("equal assert pass");
	}

}
