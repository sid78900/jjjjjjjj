package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Asseration2 {
	@Test
	public void testcase2() {
		int a=10;
		int b=20;
		
		String ActMsg = "Google";
		String ExpRes = "Google";
		
		Assert.assertEquals(ActMsg, ExpRes ,"Actual and exp or not matching");
		System.out.println("equal assert pass");
		
		Assert.assertTrue(a>b,"true assertion failed ");
		//asseretion failed execution stop here
		System.out.println("true varified");

}
	@Test
	public void testcase3() {
		//assertion written in testcase2()
        //scope of assertion limited to tescase2()
		System.out.println("hi");
	}
}