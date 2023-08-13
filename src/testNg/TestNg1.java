package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
	@Test
	public void a1() {
		System.out.println("hii tesng");
	}
	@BeforeTest
	public void b() {
		System.out.println("b method");
	}
    public void a2() {
    	System.out.println("hii b");
    	//B METHOD NOT RUN BCZ NO ANNOTATION
    }
    @AfterMethod
    public void c() {
    	System.out.println("c method");
    }
    @BeforeSuite
    public void d() {
    	System.out.println("d method");
    }
    @AfterTest
    public void f() {
    	System.out.println("f methood");
    }
    @AfterClass
    public void g() {
    	System.out.println("g method");
    }
    @BeforeMethod
    public void h() {
    	System.out.println("h method");
    }
    @AfterSuite
    public void i() {
    	System.out.println("i method");
    }
    @BeforeClass
    public void j() {
    	System.out.println("j method");
    }
}
