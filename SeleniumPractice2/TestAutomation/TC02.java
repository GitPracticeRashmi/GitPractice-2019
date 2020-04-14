package TestAutomation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC02 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside before class method");
	}
	@Before
	public  void before() {
		System.out.println("Inside before class method");
	}
	@Test
	public void test() {
		System.out.println("Inside test class method");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside the after class method");
	}
	@After
	public  void after() {
		System.out.println("Inside the after  method");
	}



}
