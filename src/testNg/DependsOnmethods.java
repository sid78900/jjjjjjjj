package testNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnmethods {
	@Test
	public void a() {
		Assert.assertTrue(3<12);
		System.out.println();
	}
@Test(dependsOnMethods = {"a"})
public void b() {
	System.out.println("b method");
}
}
