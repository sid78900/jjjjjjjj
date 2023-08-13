package testNg;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipping {
@Test
public void a() {
	System.out.println("a method");
}
@Test(enabled = false) //2nd type commenting out test "//"
public void b(){
	System.out.println("b method");
}
@Test(invocationCount = 2)
public void c() {
	System.out.println("c method");
}
@Test(invocationCount = 0)
public void d() {
	System.out.println("d method");

}
@Test
public void e() {
	System.out.println("e method");
	throw new SkipException("skipping e method");//3rd METHOD
}

}

